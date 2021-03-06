package controllers

import play.api._
import play.api.mvc._
import models.State

object States extends Controller {

  def index = Action {
    Ok(views.html.battle(State.all))
  }

  def attack(id: Long, enemy_id: Long) = Action {
    val state = State(2, 1, "bear", "lion", 100)
    State.attack(id, enemy_id, state)
    Redirect(routes.States.index())
  }

  // def index = Action {
  //   Ok(views.html.index(User.all, User.form))
  // }
  //
  // def create = Action { implicit request =>
  //   User.form.bindFromRequest.fold(
  //     errors => BadRequest(views.html.index(User.all, errors)),
  //     user => {
  //       User.create(user)
  //       Redirect(routes.Users.index())
  //     }
  //   )
  // }
  //
  // def edit(id: Long) = Action {
  //   User.get(id).map { user =>
  //     Ok(views.html.edit(id, User.form.fill(user)))
  //   } getOrElse {
  //     Redirect(routes.Users.index())
  //   }
  // }
  //
  // def update(id: Long) = Action { implicit request =>
  //   User.form.bindFromRequest.fold(
  //     errors => BadRequest(views.html.edit(id, errors)),
  //     user => {
  //       User.update(id, user)
  //       Redirect(routes.Users.index())
  //     }
  //   )
  // }
  //
  // def delete(id: Long) = Action {
  //   User.delete(id)
  //   Redirect(routes.Users.index())
  // }
}
