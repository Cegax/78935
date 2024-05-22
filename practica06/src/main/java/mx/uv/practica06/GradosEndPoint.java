    package mx.uv.practica06;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.grados.GradosFRequest;
import mx.uv.t4is.grados.GradosFResponse;

    @Endpoint
    public class GradosEndPoint {
        
        @PayloadRoot(localPart = "GradosFRequest", namespace = "t4is.uv.mx/grados")
        @ResponsePayload
        public GradosFResponse grados(@RequestPayload GradosFRequest peticion){
            double GradosFRequest = (peticion.setGradosF(double value); * 9 / 5) + 32;
            System.out.println("Los grados Celsius son: " + gradosCelsius);
            System.out.println("Los grados Fahrenheit son: " + gradosFahrenheit);
            
            GradosFResponse respuesta = new GradosFResponse();
            respuesta.setRespuestaF(gradosFahrenheit);
            return respuesta;
        }


    }
