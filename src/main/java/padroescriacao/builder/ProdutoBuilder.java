package padroescriacao.builder;

import java.util.Date;

public class ProdutoBuilder {

    private Produto produto;

    public ProdutoBuilder() {
        produto = new Produto();
    }

    public Produto build() {
        if (produto.getId() == 0) {
            throw new IllegalArgumentException("Matrícula inválida");
        }
        if (produto.getNome().equals("")) {
            throw new IllegalArgumentException("Nome inválido");
        }
        return produto;
    }

    public ProdutoBuilder setId(int id) {
        produto.setId(id);
        return this;
    }

    public ProdutoBuilder setNome(String nome) {
        produto.setNome(nome);
        return this;
    }


    public ProdutoBuilder setDescricao(String descricao) {
        produto.setDescricao(descricao);
        return this;
    }

    public ProdutoBuilder setMarca(String marca) {
        produto.setMarca(marca);
        return this;
    }

    public ProdutoBuilder setCor(String cor) {
        produto.setCor(cor);
        return this;
    }

    public ProdutoBuilder setValor(double valor) {
        produto.setValor(valor);
        return this;
    }



}
