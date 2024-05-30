<div class="semestre3">

<div align=center>
<h1>+EMPREGO</h1>
</div>

<h4> 2º Semestre • <a href="https://github.com/B1nary-Devs/OTUS-PROJECT">Repositório Github</a></h4>
<p align="justify"> Empresa Parceira • <a href="https://www.pro4tech.com.br/">Pro4tech</a></p>

<p align="center"><img src="https://github.com/WallaceHS20/Bertoti/assets/101594950/5dda1466-348d-4d96-9a1d-66a5f5b98854" widht="20%"></img>

<p align="justify"> O +Emprego é um sistema Desktop que tem como objetivo realizar o gerenciamento e acompanhamento de processos seletivos de candidatos para vagas de emprego, sendo capaz também de realizar relatórios e análises de aprovação do setor de recursos humanos.
</p>


<br>

<details>

<summary align=center> VER MAIS DETALHES :information_source: </summary>

<h2> <a name="Objetivo">Objetivo</a> </h2>

#### Após a finalização do projeto pela equipe B1naryDevs:
* O Administrador é capaz de publicar vagas de emprego no sistema;
* O usuário é capaz de se candidatar as vagas de emprego cadastradas no sistema;
* O Administrador conseguirá monitorar as aprovações e reprovações das vagas através de um Dashboard;

<br>

<h2>Tecnologias Utilizadas no Projeto</h2>

<p align="justify"> <strong>Java SE 14:</strong> linguagem para desenvolvimento da aplicação para front-end e back-end.</p>
<p align="justify"><strong>MSQL:</strong> SGBD para desenvolvimento do Banco de Dados.</p>
<p align="justify"><strong>MSQL-Connector-5.1.18:</strong> Conector do banco de dados.</p>

<img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" target="_blank">

  
<br>
  
<h3>Minhas Contribuições</h3>

 > Contribuí ativamente com a arquitetura e modelagem do banco de dados aplicando os conceitos básicos de cardinalidade e realização de consultas avançadas.

<br>

## 1. **Criação do Banco de Dados:**
   - Contribuí no script de criação e arquitetura do banco de dados e suas respectivas tabelas.

<details>
  
  <summary>Detalhes</summary>
  
~~~~sql

# Criação do banco de dados 

create database api
default character set utf8
default collate utf8_general_ci; 

use api;

# tabela Candidato, uma das principais tabelas do sistema de vagas de emprego

CREATE TABLE candidato(
nome_candidato varchar(30) not null,
cpf bigint (11) not null,
data_nasc varchar(10) not null,
telefone bigint (11) not null,
pret_salarial decimal(7,2) null,
pret_cargo varchar(30) null,
nome_comp VARCHAR(35) NULL,
instituicao VARCHAR(50) NULL,
inicio_curso varchar(10) null,
termino_curso varchar(10) null,
nivel ENUM('Básico', 'Intermediário', 'Avançado') null,
curso VARCHAR(30) NULL,
primary key (cpf)) default charset = utf8;
)

~~~~~

</details>


## 2. **Arquitetura de Banco de Dados:**
  - Criação e definição das chaves estrangeiras garantindo que as transações ocorram com segurança e precisão.

<details>
  <summary>Detalhes</summary>

~~~~sql

/* Definição de chaves estrangeiras, que permite a referência a registros oriundos
de outras tabelas do sistema, crucial para realização de consultas precisas. */

# CHAVE ESTRANGEIRA FK - EMAIL DE USUARIO
ALTER TABLE usuario ADD FOREIGN KEY (cpf_candidato_usu) REFERENCES candidato (cpf);

# CHAVE ESTRANGEIRA FK - CARGO PARA VAGA 
ALTER TABLE vaga ADD FOREIGN KEY (cargo_vaga) REFERENCES cargo (nome_cargo);

# CHAVE ESTRANGEIRA FK - CPF DO CANDIDATO PARA CANDIDATURA
ALTER TABLE candidatura ADD FOREIGN KEY (cpf_candidatura) REFERENCES candidato (cpf);

ALTER TABLE candidatura ADD FOREIGN KEY (funcionario_cpf) REFERENCES funcionario(cpf);

# CHAVE ESTRANGEIRA FK - CODIGO DA VAGA PARA CANDIDATURA
ALTER TABLE candidatura ADD FOREIGN KEY (cod_vaga) REFERENCES vaga (id_vaga);

# CHAVE ESTRANGEIRA FK - CARGO DA CANDIDATURA PARA CARGO 
ALTER TABLE candidatura ADD FOREIGN KEY (cargo_candidatura) REFERENCES cargo(nome_cargo);

# CHAVE ESTRANGEIRA FK - NOME DO CARGO PARA PRETENÇÃO DE CARGO PRETENDIDO DO CANDIDATO
ALTER TABLE candidato ADD FOREIGN KEY (pret_cargo) REFERENCES cargo(nome_cargo);

# CHAVE ESTRANGEIRA FK - CPF CANDIDATO PARA EXPERIÊNCIA PROFISSIONAL
ALTER TABLE experiencia_profissional ADD FOREIGN KEY (cpf_candidato_exp) REFERENCES candidato (cpf);

~~~~~
  
</details>

<br>

> Também atuei como desenvolvedor back-end, desempenhando um papel crucial no processo de criação de classes, desenvolvimento de funcionalidades do sistema e conexão dos componentes da interface do JavaFX com as variáveis do programa. Minhas contribuições incluíram:

<br>

## 3. **Arquitetura do Projeto:**
   - Auxiliei na criação das classes implementadas do projeto.

<details>
  <summary>Detalhes</summary>

~~~~JAVA

/* Criação da classe Usuário, essencial para o candidato ou operador do sistema logar.
Seus dados serão transmitidos para demais telas do sistema e vicnulado as transações do sistemas. */

public class Usuario {

    public static String email;
    public static Long cpf;

    public static String getEmail() {
        return email;
    }

    public static void setEmail(String email) {
        Usuario.email = email;
    }

    public static Long getCpf() {
        return cpf;
    }

    public static void setCpf(Long cpf) {
        Usuario.cpf = cpf;
    }
}
~~~~
  
</details>



## 4. **Desenvolvimento de Funcionalidades do Sistema:**
   - Auxiliei com a implementação do modelo DAO (Data Access Object) para as transações de dados entre classe do projeto e banco de dados ocorram de forma assertiva.

<details>
  <summary>Detalhes</summary>

~~~~JAVA

/* Criação e configuração da classe responsável conexão com banco de dados
por meio do padrão de projeto DAO */

public class ConnectionFactory {

    private  static  final String USERNAME = "binary";
    private  static  final String PASSWORD = "binary123";
    private  static  final String DATABASE_URL = "jdbc:mysql://localhost:3306/api";

    public static Connection createConnectionToMySQL() throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.jdbc.Driver");

        Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);

        return connection;
    }

    public static void main(String[] args) throws Exception {

        Connection con = createConnectionToMySQL();
        if (con != null) {
            System.out.println("Conexão com sucesso");

        }
    }

}
~~~~

</details>


<h2>Conhecimentos Obtidos</h2>
<p align="justify">Essa experiência multifacetada me proporcionou uma compreensão abrangente do ciclo de vida do desenvolvimento de software, desde a gestão ágil até a implementação eficaz no front-end. Estou comprometido em continuar trazendo meu conjunto diversificado de habilidades para projetos futuros.</p>
<h3>Hard Skills </h3>
<details>
  <summary><b>Clique para ver a lista de hard skills</b></summary>
  <br>
  <table align="center">
    <tr>
      <th width="300px">Tecnologia/Metodologia</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Java</td>
      <td>★★★★☆☆</td>
    </tr>
    <tr>
      <td>MySQL</td>
      <td>★★★★★☆</td>
    </tr>
  </table>
</details>
<h3>Soft Skills </h3>
<details>
<summary><b>Clique para ver a lista de soft skills</b></summary>
  <br>
  <table align="center">
    <tr>
      <th width="300px">Habilidade</th>
      <th width="300px">Classificação</th>
    </tr>
    <tr>
      <td>Proatividade</td>
      <td>★★★☆☆☆</td>
    </tr>
    <tr>
      <td>Visão de Negócio</td>
      <td>★★★★☆☆</td>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★☆☆</td>
    </tr>
    <tr>
      <td>Organização e Planejamento</td>
      <td>★★★★☆☆</td
    </tr>
 </table>
</details>

</summary>

</details>

<br>
