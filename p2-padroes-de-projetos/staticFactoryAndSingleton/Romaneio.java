package staticFactoryAndSingleton;

public class Romaneio {
    private String produto;
    private String codigo;
    private String locacao;
    private static Romaneio romaneio;

    // Método construtor, para passar como argumento na MAIN
    private Romaneio(String produto, String locacao, String codigo){
        this.produto = produto;
        this.locacao = locacao;
        this.codigo = codigo;
    }

    private Romaneio(String produto, String codigo){
        this.produto = produto;
        this.codigo = codigo;
    }

    private Romaneio(){
        this.produto = "XXX";
        this.codigo = "XXX";
        this.locacao = "XXX";
    }

    
    public static Romaneio newRomaneio(String produto, String locacao, String codigo){

        if(romaneio != null){
            romaneio.setProduto(produto);
            romaneio.setLocacao(locacao);
            romaneio.setCodigo(codigo);
            return romaneio;
        }

        if(!valida(produto) || !valida(locacao) || !valida(codigo))
            return null;
        return new Romaneio(produto,locacao,codigo);

    }

    public static Romaneio newLocacaoAndProduto(String produto, String locacao){


        if(romaneio != null){
            romaneio.setProduto(produto);
            romaneio.setLocacao(locacao);
            return romaneio;
        }

        if(!valida(produto) || !valida(locacao))
            return null;
        return new Romaneio(produto,locacao);

    }

    public static Romaneio newCodigoAndProduto(String produto, String codigo){

        if(romaneio != null){
            romaneio.setProduto(produto);
            romaneio.setCodigo(codigo);
            return romaneio;
        }

        if(!valida(produto) || !valida(codigo))
            return null;
        return new Romaneio(produto,codigo);

       
    }

    
    // Método para validar se existe algum conteúdo
    private static boolean valida(String content){
        return !content.contains(" ");
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getLocacao() {
        return locacao;
    }

    public void setLocacao(String locacao) {
        this.locacao = locacao;
    }

    public static Romaneio getRomaneio() {
        return romaneio;
    }

    public static void setRomaneio(Romaneio romaneio) {
        Romaneio.romaneio = romaneio;
    }

   

    
}
