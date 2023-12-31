package com.example.springdeploy;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    
    @Value("${app.message}")
    String message;


    @GetMapping("/hola")
    public String holaMundo(){

        System.out.println(message);

        return "Hola mundo jaja";
    }

    @GetMapping("/bootstrap")
    public String bootstrap(){ //esto es para probar que tambien uno puede mandar html por rest, pero no es recomendable, Para eso existe el springmvc
        return """
                <!doctype html>
                <html lang='en'>
                <head>
                    <meta charset='utf-8'>
                    <meta name='viewport' content='width=device-width, initial-scale=1'>
                    <title>Bootstrap demo</title>
                    <link href='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/css/bootstrap.min.css' rel='stylesheet' integrity='sha384-KK94CHFLLe+nY2dmCWGMq91rCGa5gtU4mk92HdvYe+M/SXH301p5ILy+dN9+nJOZ' crossorigin='anonymous'>
                </head>
                <body>
                    <h1>HOLA MUNDO DESDE SPRINGBOOT</h1>
                    <a class='btn btn-primary' href='https://www.google.com'> Google </a>
                    <script src='https://cdn.jsdelivr.net/npm/bootstrap@5.3.0-alpha3/dist/js/bootstrap.bundle.min.js' integrity='sha384-ENjdO4Dr2bkBIFxQpeoTz1HIcje39Wm4jDKdf19U8gI4ddQ3GYNS7NTKfAdVQSZe' crossorigin='anonymous'></script>
                </body>
                </html>
                """;
    }
}