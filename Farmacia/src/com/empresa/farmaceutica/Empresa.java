package com.empresa.farmaceutica;

import java.util.*;

public class Empresa {
    private double caixaTotal;
    private List<Funcionario> todosFuncionarios;
    private Map<String, Setor> setores;
    private List<Produto> catalogoProdutos;
    private List<Negocio> catalogoNegocios;
    private List<Transportadora> transportadoras;

    public Empresa(double caixaInicial) {
        this.caixaTotal = caixaInicial;
        this.todosFuncionarios = new ArrayList<>();
        this.setores = new HashMap<>();
        this.catalogoProdutos = new ArrayList<>();
        this.catalogoNegocios = new ArrayList<>();
        this.transportadoras = new ArrayList<>();
        inicializarSetores();
    }

    private void inicializarSetores() {

        //Categorias de beneficio
        Beneficios beneficiosTipo1 = new Beneficios(400.00, 400.00, 1000.00, 200.00, 200.00);
        Beneficios beneficiosTipo2 = new Beneficios(800.00, 800.00, 2000.00, 700.00, 350.00);
        Beneficios beneficiosTipo3 = new Beneficios(1200.00, 1200.00, 5000.00, 1000.00, 500.00);

        //BLOCO DE INSTANCIAÇÃO DO SETOR GERENCIA

        //Criação do Cargo Gerente Geral para o setor gerencia
        Cargo gerenteGeral = new Cargo("Gerente Geral", 15000.00, beneficiosTipo3);

        //criação do Setor gerencia, passando os cargos existentes para este setor
        setores.put("gerencia", new Setor("gerencia", 1, new ArrayList<Cargo>(Arrays.asList(gerenteGeral))));
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //BLOCO DE INSTANCIAÇÃO DO SETOR ATENDIMENTO AO CLIENTE

        //Criação do Cargo Atendente Junior
        Cargo atendenteJunior = new Cargo("atendente junior", 2500.00, beneficiosTipo1);
        //Criação do Cargo Atendente Pleno
        Cargo atendentePleno = new Cargo("atendente pleno", 3800.00, beneficiosTipo1);
        //Criação do Cargo Atendente Senior
        Cargo atendenteSenior = new Cargo("atendente senior", 4500.00, beneficiosTipo2);

        //criação do Setor Atendimento ao cliente, passando os cargos existentes para este setor
        setores.put("atendimentoAoCliente", new Setor("atendimentoAoCliente", 4, new ArrayList<Cargo>(Arrays.asList(atendenteJunior, atendentePleno, atendenteSenior))));


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //BLOCO DE INSTANCIAÇÃO DO SETOR GESTÃO DE PESSOAS

        //Criação do Cargo de Analista de Recursos Humanos
        Cargo analistaRecursosHumanos = new Cargo("analista de Recursos Humanos", 2500.00, beneficiosTipo1);
        //Criação do Cargo de Recrutador
        Cargo recrutador = new Cargo("recrutador", 3500.00, beneficiosTipo1);
        //Criação do Cargo de Analista de Remuneração e Benefícios
        Cargo analistaRemuneracaoBeneficios = new Cargo("analista de remuneração e benefícios", 2500.00, beneficiosTipo1);

        //criação do Setor Gestão de pessoas, passando os cargos existentes para este setor
        setores.put("gestaoDePessoas", new Setor("gestaoDePessoas", 4, new ArrayList<Cargo>(Arrays.asList(analistaRecursosHumanos, recrutador, analistaRemuneracaoBeneficios))));

//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //BLOCO DE INSTANCIAÇÃO DO SETOR FINANCEIRO

        //Criação do Cargo de Analista de Analista Financeiro
        Cargo analistaFinanceiro = new Cargo("analista financeiro", 2800.00, beneficiosTipo1);
        //Criação do Cargo Supervisor Financeiro
        Cargo supervisorFinanceiro = new Cargo("supervisor financeiro", 3500.00, beneficiosTipo2);

        //criação do Setor Financeiro, passando os cargos existentes para este setor
        setores.put("financeiro", new Setor("financeiro", 3, new ArrayList<Cargo>(Arrays.asList(analistaFinanceiro, supervisorFinanceiro))));
//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //BLOCO DE INSTANCIAÇÃO DO SETOR VENDAS

        //Criação do Cargo de Representante de Vendas
        Cargo representanteDeVendas = new Cargo("representante de vendas", 2800.00, beneficiosTipo2);
        //Criação do Cargo Supervisor de Vendas
        Cargo supervisorDeVendas = new Cargo("supervisor de vendas", 3500.00, beneficiosTipo3);

        //criação do Setor Vendas, passando os cargos existentes para este setor
        setores.put("vendas", new Setor("vendas", 5, new ArrayList<Cargo>(Arrays.asList(representanteDeVendas, supervisorDeVendas))));


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //BLOCO DE INSTANCIAÇÃO DO SETOR ALMOXARIFADO

        //Criação do Cargo de Analista de Controle de Estoque
        Cargo analistaControleDeEstoque = new Cargo("analista de controle de estoque", 3000.00, beneficiosTipo2);
        //Criação do Cargo Auxiliar de Almoxarifado
        Cargo auxiliarAlmoxarifado = new Cargo("auxiliar de almoxarifado", 2200.00, beneficiosTipo1);

        //criação do Setor Almoxarifado, passando os cargos existentes para este setor
        setores.put("almoxarifado", new Setor("almoxarifado", 3, new ArrayList<Cargo>(Arrays.asList(analistaControleDeEstoque, auxiliarAlmoxarifado))));


//--------------------------------------------------------------------------------------------------------------------------------------------------------------------
        //BLOCO DE INSTANCIAÇÃO DAS TRANSPORTADORAS PARCEIRAS

        transportadoras.add(new Transportadora("ViaSul Cargas", new ArrayList<String>(Arrays.asList("Parana", "Santa Catarina", "Rio Grande do Sul"))));
        transportadoras.add(new Transportadora("ViaSudeste Cargas", new ArrayList<String>(Arrays.asList("Sao Paulo", "Rio de Janeiro", "Minas Gerais", "Espirito Santo"))));
        transportadoras.add(new Transportadora("ViaNorte Cargas", new ArrayList<String>(Arrays.asList("Parana", "Santa Catarina", "Rio Grande do Sul"))));

    }

    public void adicionarFuncionario(Funcionario func) {
        try {
            boolean idJaExiste = todosFuncionarios.stream()
                    .anyMatch(funcionarioExistente -> funcionarioExistente.getIdFuncionario() == func.getIdFuncionario());

            if (!idJaExiste) {
                this.todosFuncionarios.add(func);
                System.out.println("Funcionário " + func.getNomeFuncionario() + " adicionado com sucesso.");

            } else {
                System.out.println("Erro: Funcionário com ID " + func.getIdFuncionario() + " já existe na lista geral.");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível adicional um Funcionario");
        }
    }

    public void adicionarProduto(Produto prod) {
        try {
            boolean idJaExiste = catalogoProdutos.stream()
                    .anyMatch(produtoExistente -> produtoExistente.getIdProduto() == prod.getIdProduto());

            if (!idJaExiste) {
                this.catalogoProdutos.add(prod);
                System.out.println("Produto " + prod.getNome() + " adicionado com sucesso.");

            } else {
                System.out.println("Erro: Produto com ID " + prod.getIdProduto() + " já existe na lista geral.");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível adicionar um Produto");
        }
    }

    public void adicionarTransportadora(Transportadora trans) {
        try {
            boolean idJaExiste = transportadoras.stream()
                    .anyMatch(transportadorasExistente -> transportadorasExistente.getNome().equals(trans.getNome()));

            if (!idJaExiste) {
                this.transportadoras.add(trans);
                System.out.println("Tranportadora " + trans.getNome() + " adicionado com sucesso.");

            } else {
                System.out.println("Erro: Transportadora com o nome " + trans.getNome() + " já existe na lista geral.");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível adicional a Transportadora");
        }
    }

    public boolean registrarNegocio(Negocio negocio) {
        try {
            boolean idJaExiste = catalogoNegocios.stream()
                    .anyMatch(negociosExistentes -> negociosExistentes.getIdNegocio() == negocio.getIdNegocio());

            if (!idJaExiste) {
                this.catalogoNegocios.add(negocio);
                System.out.println("Negocio com ID " + negocio.getIdNegocio() + " foi adicionado com sucesso.");
                return true;

            } else {
                System.out.println("Erro: Negocio com o ID " + negocio.getIdNegocio() + " já existe na lista geral.");
                throw new Exception();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível adicional a Negocio");
            return false;
        }
    }

    public void processarConclusaoNegocio(Negocio negocio) {

        if (negocio.getTipo() == TipoNegocio.VENDA) {
            for (ItemNegocio item : negocio.getItens()) {
                Produto pEmEstoque = buscarProdutoPorId(item.getProduto().getIdProduto()).orElse(null);

                if (pEmEstoque != null) {
                    pEmEstoque.removerEstoque(item.getQuantidade());
                }
            }
            this.caixaTotal += negocio.getValorTotalNegocio();

        } else if (negocio.getTipo() == TipoNegocio.COMPRA) {
            for (ItemNegocio item : negocio.getItens()) {
                Produto pEmEstoque = buscarProdutoPorId(item.getProduto().getIdProduto()).orElse(null);

                if (pEmEstoque != null) { // Assume que o produto já existe no catálogo para compra/reposição
                    pEmEstoque.adicionarEstoque(item.getQuantidade());

                } else { // Se for um produto novo sendo comprado, adiciona ao catálogo

                    // Esta lógica pode precisar de mais detalhes, como definir preço de venda para o novo produto
                    Produto novoProduto = item.getProduto(); // O produto já vem com preço de compra

                    // Definir um preço de venda padrão ou solicitar
                    novoProduto.setPrecoVenda(novoProduto.getPrecoCompra() * 1.5); // Ex: markup de 50%
                    catalogoProdutos.add(novoProduto);
                    System.out.println("Novo produto " + novoProduto.getNome() + " adicionado ao catálogo via compra.");
                }
            }
            this.caixaTotal -= negocio.getValorTotalNegocio();
        }
        negocio.setStatus(StatusNegocio.CONCLUIDO); // Garante que está concluído
        System.out.println("Negócio ID " + negocio.getIdNegocio() + " concluído. Caixa atualizado.");
    }

    public Optional<Funcionario> buscarFuncionarioPorId(int id) {
        return todosFuncionarios.stream().filter(f -> f.getIdFuncionario() == id).findFirst();
    }

    public Optional<Produto> buscarProdutoPorId(int id) {
        return catalogoProdutos.stream().filter(p -> p.getIdProduto() == id).findFirst();
    }

    public static void estimarLucros(double lucros){

    }

    public List<Setor> listarSetores() {
        return new ArrayList<>(setores.values());
    }
}


