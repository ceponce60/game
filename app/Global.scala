import play.api.db.DB
import play.api.{Application, GlobalSettings}
import anorm._


object Global extends GlobalSettings {

  /****************************************************************
   * For this module we ignored this file as it is covered in
   * the next module.  It deletes the in memory contacts collection
   * and recreates it with some dummy data.
   *///************************************************************
  override def onStart(app: Application) {

    import play.api.Play.current

    DB.withConnection { implicit connection =>
      SQL("INSERT INTO contacts(name, emailAddress) VALUES('Juan Ponce', 'cpfiro@gmail.com')").execute()
      SQL("INSERT INTO contacts(name, emailAddress) VALUES('Steven Lion Tamer', 'demagoil@gmail.com')").execute()
    }
  }
}
