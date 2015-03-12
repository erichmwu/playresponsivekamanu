package controllers;

import play.mvc.Controller;
import play.mvc.Result;
import views.html.About;
import views.html.Aukahi;
import views.html.Index;
import views.html.Kamanu;
import views.html.Pueo;

/**
 * Provides controllers for this application.
 */
public class Application extends Controller {

  /**
   * Returns the home page.
   *
   * @return The resulting home page.
   */
  public static Result index() {
    return ok(Index.render("Welcome to the home page."));
  }

  /**
   * Returns the Pueo page.
   *
   * @return The resulting Pueo page.
   */
  public static Result pueo() {
    return ok(Pueo.render());
  }

  /**
   * Returns the Aukahi page.
   *
   * @return The resulting Aukahi page.
   */
  public static Result aukahi() {
    return ok(Aukahi.render());
  }

  /**
   * Returns the Kamanu V6 page.
   *
   * @return The resulting Kamanu V6 page.
   */
  public static Result kamanu() {
    return ok(Kamanu.render());
  }

  /**
   * Returns the About page.
   *
   * @return The resulting About page.
   */
  public static Result about() {
    return ok(About.render());
  }

}
