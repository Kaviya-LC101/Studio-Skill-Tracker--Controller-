package org.launchcode.skillstracker.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@ResponseBody

public class SkillController {

@RequestMapping(value="",method={RequestMethod.GET, RequestMethod.POST})
    public String skillDisplay(){
    return
            "<h1>Skill Tracker</h1>"+
            "<h2>We have a few skills we would like to learn.Here is the list !</h2>" +
            "<ol>" +
            "<li>Java</li>" +
            "<li>JavaScript</li>" +
            "<li>Python</li>" +
            "</ol>";
}
@GetMapping("form")
public String  getUserSkill(){
 return "<html>"+
         "<body>" +
         "<form action='' method='post'>" +
         "<h1><label>Name :</label><br></h1>" +
         "<input type ='text' name='name'/><br>" +
         "<h2><label>My first favorite language</label><br></h2>" +
         "<select name='firstChoice'><br>" +
         "<option value='Java'>Java</option>" +
         "<option value='JavaScript'>Java Script</option>" +
         "<option value='Python'>Python</option>" +
         "</select><br>" +
         "<h2><label>My Second favorite language</label><br></h2>" +
         "<select name='secondChoice'><br>" +
         "<option value='Java'>Java</option>" +
         "<option value='JavaScript'>Java Script</option>" +
         "<option value='Python'>Python</option>" +
         "</select><br>" +
         "<h2><label>My Third favorite language</label><br></h2>" +
         "<select name='thirdChoice'><br>" +
         "<option value='Java'>Java</option>" +
         "<option value='JavaScript'>Java Script</option>" +
         "<option value='Python'>Python</option>" +
         "</select><br>" +
         "<br><br><input type='submit' value='SUBMIT'>" +
         "</form>" +
         "</body>" +
         "</html>" ;

}
 @PostMapping(value="form")
  @ResponseBody
    public String display(@RequestParam String name, @RequestParam String firstChoice,
                          @RequestParam String secondChoice,@RequestParam String thirdChoice){
  return "<h1>"+name+"</h1>" +
          "<h2>My favorite languages:</h2>" +
          "<ol>" +
          "<li>"+firstChoice+"</li>"+
          "<li>"+secondChoice+"</li>"+
          "<li>"+thirdChoice+"</li>"+
          "</ol>";
  }

}
