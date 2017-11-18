package models

import anorm._
import play.api.db.DB
import play.api.Play.current
import play.api.data._
import play.api.data.Forms._

case class User(id: Long, name: String, emailAddress: String)

object User {

  def all = {
    DB.withConnection { implicit connection =>
      val users = SQL("SELECT * FROM users")().map { row =>
        User(
          id = row[Long]("id"),
          name = row[String]("name"),
          emailAddress = row[String]("emailAddress")
        )
      }

      users.toList
    }
  }

  def create(user: User) {
    DB.withConnection { implicit connection =>
      SQL("INSERT INTO users(name, emailAddress) VALUES({name}, {emailAddress})").on(
        "name" -> user.name,
        "emailAddress" -> user.emailAddress
      ).execute()
    }
  }

  def get(id: Long) = {
    DB.withConnection { implicit connection =>
      SQL("SELECT * FROM users WHERE id={id}").on("id" -> id)().headOption.map { row =>
        User(
          id = row[Long]("id"),
          name = row[String]("name"),
          emailAddress = row[String]("emailAddress")
        )
      }
    }
  }

  def update(id: Long, user: User) {
    DB.withConnection { implicit connection =>
      SQL("UPDATE users SET name={name}, emailAddress={emailAddress} WHERE id={id}").on(
        "id" -> id,
        "name" -> user.name,
        "emailAddress" -> user.emailAddress
      ).execute()
    }
  }

  def delete(id: Long) {
    DB.withConnection { implicit connection =>
      SQL("DELETE FROM users WHERE id={id}").on("id" -> id).execute()
    }
  }

  val form = Form(
    mapping(
      "id" -> ignored(0L),
      "name" -> nonEmptyText,
      "emailAddress" -> email
    )(User.apply)(User.unapply)
  )

}
