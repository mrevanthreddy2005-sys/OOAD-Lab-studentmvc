package com.example.student.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import com.example.student.model.Student;
import com.example.student.service.StudentService;

@Controller
public class StudentController {

    @Autowired
    private StudentService service;

    @GetMapping("/")
    public String viewHome(Model model){
        model.addAttribute("student", new Student());
        model.addAttribute("students", service.getAllStudents());
        return "index";
    }

    @PostMapping("/save")
    public String saveStudent(@ModelAttribute Student student){
        service.saveStudent(student);
        return "redirect:/";
    }

}