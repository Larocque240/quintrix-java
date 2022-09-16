package com.dev.introductiontojpa.controller;
import com.dev.introductiontojpa.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class StudentController {

    @GetMapping("/get")
    public Student GetModel(@RequestParam String fname, @RequestParam String lname) {

        Student gpm = new Student();
        gpm.setFirstname(fname);
        gpm.setLastname(lname);

        return  gpm;
    }

    @PostMapping("/post")
    public Student GetPost(@RequestBody Student myInput) {
        Student gpm = new Student();
        gpm.setFirstname((myInput.getFirstname() + " <-- This is the response"));
        gpm.setLastname((myInput.getLastname() + " <-- This is the response"));
        return gpm;
    }


}
