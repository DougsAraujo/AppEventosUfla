package com.example.cimtech.eventosufla;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Path;

/**
 * Created by cimtech on 10/08/17.
 */

public interface EventosUflaService {

    @POST("/usuarios/autentica")
    Call<Usuario> buscaUsuario(@Body UsuarioLogin usuarioLogin);

}
