package endpoint;

import model.Cliente;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

/**
 * Created by USUARIO on 14/11/2016.
 */

public interface ClienteEndPoint {

    @GET("agenda/clientes/{ruc}/{claUsu}")
    Call<Cliente> getCliente(@Path("ruc") String ruc,@Path("claUsu")  String claUsu);

}