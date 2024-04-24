public class fila {

    private static fila instancia;

    private fila() {
    }
    public static fila getInstancia (){
        if (instancia == null) {
            instancia = new instancia;

        }
        return instancia;

    }
    public void ImprimeDocumento() {
    }
    public void RemoveDocumento() {
    }
    public void RemoveTodosDocumento() {
    }
}