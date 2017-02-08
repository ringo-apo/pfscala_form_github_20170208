package controllers

import javax.inject._
import play.api._
import play.api.mvc._

@Singleton
class HomeController @Inject() extends Controller {

  def index = Action {
    Ok(views.html.index("Your new application is ready."))
  }

  def test = Action {
    Ok(views.html.test("This is a test page.."))
  }

  def kekka(text1: String , text2: String , text3: String) = Action {
    val a1 = text1
    val a2 = text2
    val a3 = text3

    val total: Int = a1.toInt + a2.toInt + a3.toInt
    val totalString: String  = total.toString
    Ok(views.html.kekka(totalString))
  }

  def db = Action {
    Ok(views.html.db("データベースを表示するページです。"))
  }





}
