package exerciciopratico;
//PARA FAZER A INTERFACE SER FUNCIONAL NA CLASSE "LIVRO", DEVE-SE IR NA CLASSE LIVRO E ACRESCENETAR
//"IMPLEMENTS PUBLICACAO (NOME DA INTERFACE). DEPOIS, CLICAR NA LAMPADA E IMPLEMENTAR TODOS OS METODOS ABSTRATOS
public interface Publicacao {
    public void abrir();
    public void fechar();
    public void folhear(int p); //parâmetro pois ele irá folhear até determinada 'p' página
    public void avancarPag();
    public void voltarPag();
}
