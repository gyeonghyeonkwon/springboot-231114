package com.example.sb20231114.domain.home.home.controller;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

@Controller
public class HomeController {

    @GetMapping("/")
    @ResponseBody
    String showMain() {
        System.out.println("하하하");
        return "안녕하세요";
    }

    @GetMapping("/about")
    @ResponseBody
    String showAbout() {
        return "저는 권경현이에요 ~~~";
    }

    @GetMapping("/calc")
    @ResponseBody
    String showCalc(int a, int b) {
        return "계산기";
    }

    @GetMapping("/calc2")
    @ResponseBody
    String showCalc2(Integer a, Integer b) {
        return "a : " + a + " , b :" + b;
    }


    @GetMapping("/calc3")
    @ResponseBody
    String showCalc3(

            @RequestParam(defaultValue = "100") int a,
            @RequestParam(defaultValue = "200") int b

    ) {
        return "계산결과 : %d ".formatted(a + b);
    }

    @GetMapping("/calc4")
    @ResponseBody
    String showCalc4(

            @RequestParam(defaultValue = "0") double a,
            @RequestParam(defaultValue = "0") double b

    ) {
        return "계산결과 : %f ".formatted(a + b);
    }

    @GetMapping("/calc5")
    @ResponseBody
    String showCalc5(

            @RequestParam(defaultValue = "0") String a,
            @RequestParam(defaultValue = "0") String b

    ) {
        return "계산결과 : %s ".formatted(a + b);
    }

    @GetMapping("/calc6")
    @ResponseBody
    int showCalc6(

            int a, int b

    ) {
        return a + b;
    }

    @GetMapping("/calc7")
    @ResponseBody
    boolean showCalc7(

            int a, int b

    ) {
        return a > b;
    }

    @GetMapping("/calc8")
    @ResponseBody
    Person showCalc8(

        String name , int age
    ) {
        return new Person(name , age);
    }

    @GetMapping("/calc9")
    @ResponseBody
    Person2 showCalc9(

            String name , int age
    ) {
        return new Person2(name , age);
    }

    @GetMapping("/calc10")
    @ResponseBody
    Map<String, Object> showCalc10(

            String name , int age
    ) {
        Map<String, Object> personMap = Map.of(
          "name" , name ,
          "age" , age
        );
        return personMap;
    }

    @GetMapping("/calc11")
    @ResponseBody
    List<Integer> showCalc11(

    ) {
        List<Integer> nums = new ArrayList<>() {{

            add(10);
            add(-599);
            add(99999);
        }};
        return nums;
    }

    @GetMapping("/calc12")
    @ResponseBody
    int[] showCalc12() {

     int [] nums = new int[] {100 , -5990 , 5055};

     return nums;
    }


    @GetMapping("/calc13")
    @ResponseBody
    List<Person2> showCalc13(

            String name , int age
    ) {
        List<Person2> persons = new ArrayList<>() {{

            add(new Person2(name,age));
            add(new Person2(name + "1" , age + 1));
            add(new Person2(name + "1" , age + 2));
        }};
        return persons;
    }

    @GetMapping("/calc14")
    @ResponseBody
    String showCalc14(){

        StringBuilder sb = new StringBuilder();

        sb.append("");

        sb.append("<div>") ;

        sb.append("<input type=\"text\" placeholder=\"내용\">") ;

        sb.append("</div>") ;

        return sb.toString();
    }

    @GetMapping("/calc15")
    @ResponseBody
    String showCalc15(){

        String html = "<div> <input type=\"text\" placeholder=\"내용\"> </div>";

        return html;
    }


    @GetMapping("/calc16")
    @ResponseBody
    String showCalc16(){

        String html = """
                <div> 
                <input type=\"text\" placeholder=\"내용\"> 
                </div>
                       
                 """;

        return html;
    }

    @GetMapping("/calc17")
    @ResponseBody
    String showCalc17(){

        String html = """
                <div> 
                <input type="text" placeholder="내용" value ="반갑습니다"> 
                </div>
                       
                 """;

        return html;
    }

    @GetMapping("/calc18")
    @ResponseBody
    String showCalc18(
            @RequestParam(defaultValue = "") String subject,
            @RequestParam(defaultValue = "") String content
    ){

        String html = """
                <div> 
                <input type="text" placeholder="제목" value ="%s"> 
                </div>
                <div> 
                <input type="text" placeholder="내용" value ="%s"> 
                </div>
                       
                 """.formatted(content , subject);

        return html;
    }

    @GetMapping("/calc20")
    //@ResponseBody
    String showCalc20(){


            return "calc20"; //calc20 .html 파일 을 보여준다.
    }

    @GetMapping("/calc21")
        //@ResponseBody
    String showCalc21(Model model){

        model.addAttribute("v1" , "안녕");
        model.addAttribute("v2" , "하세요");

        return "calc21"; //calc21 .html 파일 을 보여준다.
    }
    int num =0;
    @GetMapping("/calc22")
    @ResponseBody
    int showCalc22(){

        num++;
        return num;

    }
}

@AllArgsConstructor
    class Person {

       public String name;
       public int age;

    }
@AllArgsConstructor
class Person2 {
    @Getter
    private String name;
    @Getter
    private int age;

}