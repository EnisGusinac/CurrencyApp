package controllers;

import models.Currency;
import play.mvc.Controller;
import play.mvc.Result;
import repositories.CurrencyRepository;
import views.html.currencies.*;

/**
 *  CurrencyController
 */
public class CurrencyController extends Controller {

    // show all the currencies availables
    public Result index() {
        return ok(show.render(CurrencyRepository.allCurrencies()));
    }

    public Result show(String id) {
        return TODO;
    }

    public Result create() {
        return TODO;
    }

    public Result edit(String id) {
        return TODO;
    }

    public Result update(){
        return TODO;
    }

    public Result save() {
        return TODO;
    }

    public Result delete(String id) {
        return TODO;
    }
}
