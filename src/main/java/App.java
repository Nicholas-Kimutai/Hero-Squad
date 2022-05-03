import spark.ModelAndView;
import spark.template.handlebars.HandlebarsTemplateEngine;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

import static spark.Spark.*;

public class App {
    public static void main(String[] args) {
        staticFileLocation("/public");
        get("/", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            return new ModelAndView(model, "index.hbs");
        }, new HandlebarsTemplateEngine());

        // Heroes details
        get("/heroes", (request, response) -> {
            Map<String, Object> model = new HashMap<String, Object>();
            ArrayList<Hero> heroes = Hero.getAll();
            model.put("heroes",heroes);
            ArrayList<Squad> squads = Squad.getAll();
            model.put("squads",squads);
            return new ModelAndView(model, "heroes.hbs");
        },new HandlebarsTemplateEngine());









    }
}
