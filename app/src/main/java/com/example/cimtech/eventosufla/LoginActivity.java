package com.example.cimtech.eventosufla;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import retrofit2.Call;
import android.telecom.Connection;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;

import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;

public class LoginActivity extends AppCompatActivity {
    private Retrofit retrofit;
    private  EventosUflaService eventosUflaService;
    private TextView email,senha;
    private Button bt_login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        email = (TextView) findViewById(R.id.txtEmail);
        senha = (TextView) findViewById(R.id.txtSenha);
        bt_login = (Button) findViewById(R.id.btnLogar);

        RetrofitInitiator connection = new RetrofitInitiator();
        retrofit = connection.getInitiator();
        eventosUflaService = retrofit.create(EventosUflaService.class);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                efetuarLogin();
            }
        });
    }

    private void efetuarLogin(){

        UsuarioLogin usuarioLogin = new UsuarioLogin(email.getText().toString(),senha.getText().toString());
        Call call = eventosUflaService.buscaUsuario(usuarioLogin);
        call.enqueue(new Callback<Usuario>() {
            @Override
            public void onResponse(Call<Usuario> call, Response<Usuario> response) {
                Usuario usuario;
                usuario = response.body();
                if (usuario != null) {


                    Intent i = new Intent(LoginActivity.this,MainActivity.class);
                    i.putExtra("usuario", usuario);
                    startActivity(i);

                    /*Log.d("Nome Usuario: ", usuario.getNome()+"");
                    Log.d("email ",usuario.getEmail());
                    Log.d("senha: ",usuario.getSenha());
                    Log.d("curso: ", usuario.getCurso());
                    for(int i = 0; i < usuario.getEventos().size(); i++){
                        Log.d("Eventos: ", usuario.getEventos().get(i).getDescricao());
                    }*/

                }else{
                    mostraerro();
                }
            }

            @Override
            public void onFailure(Call call, Throwable t) {
                Log.d("Erro",
                        "Erro");
            }
        });
    }

    public void mostraerro(){
        Toast.makeText(this, "Usuario ou Senha incorretos", Toast.LENGTH_SHORT).show();
    }

}
