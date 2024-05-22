package mx.uv.demo;

import org.springframework.ws.server.endpoint.annotation.Endpoint;
import org.springframework.ws.server.endpoint.annotation.PayloadRoot;
import org.springframework.ws.server.endpoint.annotation.RequestPayload;
import org.springframework.ws.server.endpoint.annotation.ResponsePayload;

import mx.uv.t4is.saludos.SaludarRequest;
import mx.uv.t4is.saludos.SaludarResponse;

@Endpoint
public class SaludosEndPoint {
    
    @PayloadRoot(localPart = "SaludarRequest", namespace = "t4is.uv.mx/saludos")
    @ResponsePayload
    public SaludarResponse saludos(@RequestPayload SaludarRequest peticion){
        System.out.println("hola "+peticion.getNombre());
        SaludarResponse respuesta = new SaludarResponse();
        respuesta.setSaludo("hola "+peticion.getNombre());
        return respuesta;
    }
}
