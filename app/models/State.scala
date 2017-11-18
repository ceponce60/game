package models

import anorm._
import play.api.db.DB
import play.api.Play.current
import play.api.data._
import play.api.data.Forms._

case class State(id: Long, enemy_id: Long, name: String, enemy_name: String, health: Long)

object State {

  def all = {
    DB.withConnection { implicit connection =>
      val states = SQL("SELECT * FROM states")().map { row =>
        State(
          id = row[Long]("id"),
          enemy_id = row[Long]("enemy_id"),
          name = row[String]("name"),
          enemy_name = row[String]("enemy_name"),
          health = row[Long]("health")
        )
      }

      states.toList
    }
  }

  // def get(id: Long) = {
  //   DB.withConnection { implicit connection =>
  //     SQL("SELECT * FROM states WHERE id={id}").on("id" -> id)().headOption.map { row =>
  //       State(
  //         id = row[Long]("id"),
  //         enemy_id = row[Long]("enemy_id"),
  //         name = row[String]("name"),
  //         enemy_name = row[String]("enemy_name"),
  //         health = row[Long]("health")
  //       )
  //     }
  //   }
  // }

  // def update(id: Long, state: State) {
  //   DB.withConnection { implicit connection =>
  //     SQL("UPDATE states SET name={name}, emailAddress={emailAddress} WHERE id={id}").on(
  //       "id" -> id,
  //       "name" -> state.name,
  //       "emailAddress" -> state.emailAddress
  //     ).execute()
  //   }
  // }

  // subtract 5 from health
  def attack(id: Long, enemy_id: Long, state: State) {
    DB.withConnection { implicit connection =>
      SQL("""
        UPDATE states SET enemy_id= {enemy_id} WHERE id={id};
        UPDATE states SET health= health - 5 WHERE id={enemy_id};
        """).on(
        "id" -> id,
        "enemy_id" -> enemy_id,
        "name" -> state.name,
        "enemy_name" -> state.enemy_name,
        "health" -> state.health
      ).execute()
    }
  }

  // val form = Form(
  //   mapping(
  //     "id" -> ignored(0L),
  //     "name" -> nonEmptyText,
  //     "emailAddress" -> email
  //   )(State.apply)(State.unapply)
  // )

}
