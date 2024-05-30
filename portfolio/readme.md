<div class="semestre1">

<div align=center>
<h1>OTUS PROJECT</h1>
</div>

<h4> 1º Semestre • <a href="https://github.com/B1naryDevs/API">Repositório Github</a></h4>
<p align="justify"> Empresa Parceira • <a href="https://fatecsjc-prd.azurewebsites.net">FATEC SJC</a></p>

<p align="center"><img src="https://github.com/WallaceHS20/Bertoti/assets/101594950/2858b006-347d-4796-9a4b-c5edb0c4ea19" widht="20%"></img>

<p align="justify"> A Otus Project é uma assistente virtual acionada por comando de voz, tendo como público alvo alunos de programação que buscam inovar seus métodos de estudo e organizar seus horários.</p>

<details>
  
  <summary align=center> VER MAIS DETALHES :information_source: </summary>

  <h2> <a name="Objetivo">Objetivo</a> </h2>

#### Após a finalização do projeto pela equipe B1naryDevs:
* O sistema será capaz de responder a comandos de voz ou sons específicos
* O sistema será capaz de auxiliar o aluno em sua rotina de estudos.
* O usuário conseguirá obter artigos com facilidades
  
<br>

<h2>Tecnologias Utilizadas no Projeto</h2>

<p align="justify"> <strong>Python 3 </strong> linguagem para desenvolvimento da aplicação para front-end e back-end.</p>

![Python](https://img.shields.io/badge/python-3670A0?style=for-the-badge&logo=python&logoColor=ffdd54) ![Matplotlib](https://img.shields.io/badge/Matplotlib-%23ffffff.svg?style=for-the-badge&logo=Matplotlib&logoColor=black)
  
<br>
  
<h3>Minhas Contribuições</h3>

 > Contribuí ativamente com desenvolvimento de funcionalidades do sistema e interatividade do usuário.

## 1. **Desenvolvimento de funcionalidades do sistema**
   - Contribuí ativamente com o desenvolvimento de funcionalidades de interatividade com usuário.

<details>
  <summary>Detalhes</summary>

~~~~python
# A função seguinte tem como objetivo escutar o usuário e encaminha-lo para uma página de um artigo com seu respectivo assunto escolhido

def consult_art():
    while True:
        falar('DIGA O NÚMERO DO ITEM QUE DESEJA PESQUISAR EM VOZ ALTA:')
        threading.Thread(target=tocar, args=["start.mp3"]).start()
        escolha = ouvir() #variavel escolha recebe valor dito pelo usuario
        threading.Thread(target=tocar, args=["success.mp3"]).start()
        new = 0

            #caso escolha seja verdadeira, executa comando para abrir navegador com url pré-determinada
        if escolha == '1':
            webbrowser.open('https://ftp.unicamp.br/pub/apoio/treinamentos/logica/logica.pdf', new=new)
            webbrowser.open('https://www.seduc.ce.gov.br/wp-content/uploads/sites/37/2012/06/informatica_logica_de_programacao.pdf', new=new)
            webbrowser.open("https://dicasdeprogramacao.com.br/download/ebook-logica-de-programacao-para-iniciantes.pdf", new=new)
            interface.destroy() #após navegador ser aberto, fechará a interface e pausa a repetição
            break

        elif escolha == '2':
            webbrowser.open('http://antigo.scl.ifsp.edu.br/portal/arquivos/2016.05.04_Apostila_Python_-_PET_ADS_S%C3%A3o_Carlos.pdf', new=new)
            webbrowser.open('https://irias.com.br/blog/python-mysql-criando-um-crud-completo/', new=new)
            interface.destroy()
            break

        elif escolha == '3':
            webbrowser.open('https://www.devmedia.com.br/instalando-e-configurando-a-nova-versao-do-mysql/25813', new=new)
            webbrowser.open('http://www.telecentros.sp.gov.br/saber/apostilas/antigas/apostila_sql.pdf', new=new)
            interface.destroy()
            break

        else:
            falar("Diga um valor compatível com a lista!") # caso escolha do usuraio seja incompativel com itens da lista
~~~~
  
</details>

## 2. **Execução de funcionalidades em Thread**
   - Contribuí ativamente com o desenvolvimento de funcionalidades de interatividade com usuário.

<details>
  <summary>Detalhes</summary>

~~~~python
# EXECUÇÃO DE DUAS FUNCIONALIDADES SIMULTÂNEAS ( INTERFACE E SISTEMA DE VOZ )
def guia_de_estudo():
    global interface
    interface = Tk()
    image = Image.open("imagens\\fundo_consult.png")
    photo = ImageTk.PhotoImage(image, master=interface)
    fundo = tk.Label(interface, image=photo)
    fundo.image = image
    fundo.pack()
    interface.geometry('800x650+250+5')
    interface.title("Guia de estudo")
    threading.Thread(target=questionario).start() # executar função simultaneamente com interface
    interface.mainloop() #executa a abertura da interface
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
      <td>Lógica de Programação</td>
      <td>★★★★☆☆</td>
    </tr>
    <tr>
      <td>Python</td>
      <td>★★★★★★</td>
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
      <td>★★★★☆☆</td>
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

</details>

<br>

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

<div class="semestre3">

<div align=center>
<h1>ROCK PLANNING</h1>
</div>
  
<h4> 3º Semestre • <a href="https://github.com/B1nary-Devs/DOM-ROCK">Repositório Github</a></h4>
<p align="justify"> Empresa Parceira • <a href="https://www.domrock.net/">DOM ROCK</a></p>

<p align="center"><img src="https://github.com/WallaceHS20/Bertoti---Engenharia-de-Software/assets/101594950/cede74e7-daaa-454b-ba81-e2775b8713a1" widht="20%"></img>

<p align="justify"> A Rock Planning é uma aplicação web que visa gerenciar as vendas, considerando o histórico do vendedor, o planejamento e as vendas realizadas. Deverá apresentar um comparativo dos dados mencionados anteriormente para que possam ser analisados de forma precisa e detalhada. Além disso, a aplicação será aprimorada com a adição de uma predição gerada por um algoritmo de Inteligência Artificial pré-existente, a fim de proporcionar maior precisão e confiabilidade.</p>

<br>

<details>

<summary align=center> VER MAIS DETALHES :information_source: </summary>

<h2> <a name="Objetivo">Objetivo</a> </h2>

#### Após a finalização do projeto pela equipe B1naryDevs:
* O Administrador é capaz de cadastrar vendedores e a carteira de clientes;
* O Vendedor conseguirá planejar as vendas para seus clientes;
* O Administrador conseguirá monitorar as vendas de todos os vendedores através de um Dashboard;
* O Vendedor conseguirá monitorar suas respectivas vendas através de um dashboard.

<br>

<h2>Tecnologias Utilizadas no Projeto</h2>

<p align="justify"> <strong>Java SE 14:</strong> linguagem para desenvolvimento da aplicação para front-end e back-end.</p>
<p align="justify"><strong>MSQL:</strong> SGBD para desenvolvimento do Banco de Dados.</p>
<p align="justify"><strong>Spring Boot 3:</strong> Framework web responsável pelo gerenciamento de microsserviços. 

<img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=java&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/MySQL-00000F?style=for-the-badge&logo=mysql&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/Spring-6DB33F?style=for-the-badge&logo=spring&logoColor=white">

<img src="https://img.shields.io/badge/JavaScript-F7DF1E?style=for-the-badge&logo=javascript&logoColor=black" target="_blank"><img src="https://img.shields.io/badge/CSS3-1572B6?style=for-the-badge&logo=css3&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/HTML5-E34F26?style=for-the-badge&logo=html5&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/Bootstrap-563D7C?style=for-the-badge&logo=bootstrap&logoColor=white" target="_blank"><img src="https://img.shields.io/badge/IntelliJ_IDEA-000000.svg?style=for-the-badge&logo=intellij-idea&logoColor=white" target="_blank">

  
<br>
  
<h3>Minhas Contribuições</h3>
  
> Contribuí ativamente como desenvolvedor front-end, desempenhando um papel crucial na arquitetura e estilização das páginas. Minhas contribuições incluíram:

<br>

## 1. **Arquitetura HTML:**
   - Colaborei com a arquitetura e estruturações da página, garantindo a escalabilidade e modularidade do código com HTML.

<details>
<summary>Detalhes</summary>
  
  ~~~~HTML
<!-- Tabela de vendedores com classes para estilização e identificador único para manipulação via scripts -->
<table class="table" id="tabelaVendedores">
  <!-- Cabeçalho da tabela definindo as colunas disponíveis -->
  <thead>
    <tr>
      <th scope="col">ID</th>
      <th scope="col">Nome</th>
      <th scope="col">E-mail</th>
      <th scope="col">Editar</th>
      <th scope="col">Detalhes</th>
    </tr>
  </thead>
  <!-- O corpo da tabela é intencionalmente omitido aqui, provavelmente será preenchido dinamicamente com dados dos vendedores -->
</table>
~~~~

</details>

<br>

## 2. **Estilização de Páginas:**
   - Contribuí para a estilização de páginas, seguindo as melhores práticas de design e garantindo uma interface de usuário atraente e intuitiva.

<details>

<summary>Detalhes</summary>

~~~~CSS
/* Estilo geral para todas as tabelas, definindo largura, colapso de borda para evitar espaços duplos, cor da borda, e centralização na página */
table {
    width: 80%;
    border-collapse: collapse;
    border: 1px solid #bdc3c7;
    margin: auto;
}

/* Estilo para linhas da tabela para melhorar a interação do usuário, com uma transição suave para hover e cursor de ponteiro para indicar clicabilidade */
tr {
    transition: all .2s ease-in;
    cursor: pointer;
}

/* Estilo para células e cabeçalhos de tabela, definindo o espaçamento interno, alinhamento do texto e borda inferior para separar as linhas */
th, td {
    padding: 12px;
    text-align: left;
    border-bottom: 1px solid #ddd;
}

/* Efeito hover para linhas da tabela, com mudança de cor de fundo, leve aumento de escala e sombra para destacar a linha atual sob o mouse */
tr:hover {
    background-color: #f5f5f5;
    transform: scale(1.02);
    box-shadow: 2px 2px 12px rgba(0, 0, 0, 0.2), -1px -1px 8px rgba(0, 0, 0, 0.2);
}

/* Estilo específico para células e cabeçalhos da tabela com a classe 'table', definindo fonte, cor da borda e do texto, tamanho da fonte, alinhamento do texto e espaçamento interno */
.table td, .table th {
    font-family: Arial, Helvetica, sans-serif;
    border-bottom: 1px solid #000000;
    color: #000000;
    font-size: 16px;
    text-align: center;
    padding: 12px 12px; 
}

/* Estilo adicional para cabeçalhos da tabela, definindo cor de fundo, sombra da caixa, cor do texto e peso da fonte para um destaque visual claro */
.table th {
    background-color: #1842ca;
    color: #ffffff;
    box-shadow: rgba(0, 0, 0, 0.24) 0px 3px 8px;
    color: white; 
    font-weight: bold; 
}
~~~~

</details>

<br>

## 3. **Requisições REST:**
   - Colaborei no desenvolvimento de funções dedicadas para realizar requisições, garantindo a integridade e usabilidade dos dados transmitidos e recebidos.

<details>

<summary>Detalhes</summary>

~~~JavaScript

// Esta função realiza uma requisição GET para nossa API Spring Boot e atualiza o valor da constante vendedores

async function buscarVendedores() {
    try {

        /* Utilizando a biblioteca axios para realizar uma requisição GET para a URL especificada que representa um
         um endpoint da nossa API Spring Boot que retorna os dados dos vendedores. */
        
        const response = await axios.get("http://localhost:8080/vendedor");

        // Atribuindo o resultado a constante vendedores
        // A propriedade .data é usada para acessar os dados da resposta (response)
        vendedores.value = resposta.data;

    } catch (ex) {

        // Em caso de erro, exibe um alerta indicando que algo deu errado
        alert('Ocorreu uma falha!');

        // A mensagem de erro é obtida através da propriedade .message do objeto de exceção (ex)
        erro.value = (ex as Error).message;
    }
}

~~~

</details>
  
<br>

> Durante o desenvolvimento do projeto, desempenhei o papel de Scrum Master, assumindo responsabilidades cruciais para garantir a eficiência e qualidade do trabalho da equipe. Como Scrum Master, minhas principais atribuições incluíram:

<br>

## 4. **Elaboração de Tasks e User Stories:**
   - Colaborei ativamente com a equipe na definição e elaboração de tarefas e histórias de usuário.
   - Garanti que as User Stories fossem claras, compreensíveis e atendessem aos critérios de aceitação.

## 5. **Gestão da Produtividade:**
   - Implementei práticas ágeis para melhorar a eficiência da equipe.
   - Removi obstáculos que prejudicavam o progresso da equipe, promovendo um ambiente de trabalho livre de obstáculos.
   - Mantive uma comunicação transparente entre os membros da equipe, promovendo a colaboração e o entendimento mútuo.

<br>

<details>
  <summary>Detalhes</summary>

<img width="907" alt="Captura de tela 2023-09-27 194721" src="https://github.com/WallaceHS20/Bertoti---Engenharia-de-Software/assets/101594950/2d7745b4-4556-497b-abd1-ea40c6b91009">
    
</details>

<br> <br>

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
      <td>★★★☆☆☆</td>
    </tr>
    <tr>
      <td>HTML</td>
      <td>★★★★★☆</td>
    </tr>
        <tr>
      <td>CSS</td>
      <td>★★★★★☆</td>
    </tr>
        <tr>
      <td>JavaScript</td>
      <td>★★★☆☆☆</td>
    </tr>
    <tr>
      <td>MySQL</td>
      <td>★★★☆☆☆</td>
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
      <td>★★☆☆☆☆</td>
    </tr>
    <tr>
      <td>Comunicação</td>
      <td>★★★★☆☆</td>
    </tr>
    <tr>
      <td>Empatia</td>
      <td>★★★★★☆</td>
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

<div class="semestre4">

<div align=center>
<h1>OTUS PROJECT</h1>
</div>

<h4> 4º Semestre • <a href="https://github.com/B1nary-Devs/JAIA-SOFTWARE">Repositório Github</a></h4>
<p align="justify"> Empresa Parceira • <a href="https://jaia.software/blog/">Jaia Software</a></p>

<p align="center"><img src="https://github.com/B1nary-Devs/JAIA-SOFTWARE/assets/102266928/9a081b92-bb7d-4a3f-8b88-f1e68f69848e" widht="20%"></img>

<p align="justify"> desenvolver um sistema abrangente para controlar anomalias identificadas em um Laudo de Inspeção Predial, com funcionalidades-chave como diferenciação de segmentos específicos de um edifício, cadastro de prestadores de serviço, geração eficiente de ordens de serviço e criação de relatórios detalhados.</p>

<details>
  
  <summary align=center> VER MAIS DETALHES :information_source: </summary>

  <h2> <a name="Objetivo">Objetivo</a> </h2>

#### Após a finalização do projeto pela equipe B1naryDevs:
* O sistema será capaz fornecer laudos técnicos prediais.
* O sistema será fornecer automatizar tarefas acelerando a gestão de contratos empresariais
* O cliente receberá por e-mail o resultado de seus laudos
  
<br>

<h2>Tecnologias Utilizadas no Projeto</h2>

<p align="justify"> <strong>Java 14:</strong> linguagem para desenvolvimento da aplicação para back-end.</p>
<p align="justify"> <strong>TypeScript:</strong> linguagem para desenvolvimento da aplicação para front-end.</p>
<p align="justify"> <strong>Vue JS:</strong> Framework de desenvolvimento de interfaces de usuário e aplicativos de página única.</p>
<p align="justify"> <strong>Spring Boot:</strong> Framework Java de desenvolvimento de aplicações Spring, proporcionando configuração automática e um ambiente de execução standalone.</p>


![Vue.js](https://img.shields.io/badge/vuejs-%2335495e.svg?style=for-the-badge&logo=vuedotjs&logoColor=%234FC08D) ![TypeScript](https://img.shields.io/badge/typescript-%23007ACC.svg?style=for-the-badge&logo=typescript&logoColor=white) ![Java](https://img.shields.io/badge/java-%23ED8B00.svg?style=for-the-badge&logo=openjdk&logoColor=white) ![Spring](https://img.shields.io/badge/spring-%236DB33F.svg?style=for-the-badge&logo=spring&logoColor=white)
  
<br>
  
<h3>Minhas Contribuições</h3>

 > Contribuí ativamente como desenvolvedor front-end na construção da arquitetura e design da aplicação, colaborando com a equipe para criar uma estrutura escalável e eficiente.

## 1. **Criação de componentes**
   - Contribuí ativamente com o desenvolvimento de componentes de interface, focando na criação de elementos visuais interativos e responsivos.

<details>
  <summary>Detalhes</summary>

  ~~~~typescript
# Criação do componente popUp quando determinada ação ou processo é finalizada

<template>
    <div v-if="showPopup" class="cover"></div>
    <div class="card" :class="{ active: showPopup }">
        <button @click="ocultarPopup" class="dismiss" type="button">×</button>
        <div class="header">
            <div class="image">
                <svg viewBox="0 0 24 24" fill="none" xmlns="http://www.w3.org/2000/svg">
                    <g id="SVGRepo_bgCarrier" stroke-width="0"></g>
                    <g id="SVGRepo_tracerCarrier" stroke-linecap="round" stroke-linejoin="round"></g>
                    <g id="SVGRepo_iconCarrier">
                        <path d="M20 7L9.00004 18L3.99994 13" stroke="#000000" stroke-width="1.5" stroke-linecap="round"
                            stroke-linejoin="round"></path>
                    </g>
                </svg>
            </div>
            <div class="content">
                <span class="title">{{ title }}</span>
                <p class="message">{{ mensagem }}</p>
            </div>
        </div>
    </div>
</template>
~~~~
  
</details>

## 2. **Criação de Views**
   - Contribuí ativamente com o desenvolvimento de diversas páginas de renderização, garantindo que os formulários e layouts fossem responsivos e de fácil navegação.

<details>
  <summary>Detalhes</summary>

  ~~~~typescript
# Formulário de cadastro de prestador
<template>
  <div class="form-cadastro">
      <div class="form-title">
          <h1>Prestador de Serviço</h1>
          <span>> Cadastro</span>
      </div>
      <div class="form-body">
          <div class="input-group">
              <div class="input-box">
                  <label for="id_nome">Nome</label>
                  <input type="text" id="id_nome" v-model="nome" placeholder="Ex: Encanador">
              </div>

              <div class="input-box">
                  <label for="id_cnpj">CNPJ</label>
                  <input type="number" id="id_cnpj" v-model="cnpj" placeholder="00.000.000/0000-00">
              </div>

              <div class="input-box">
                <label for="id_categoria">Segmento</label>
                <select id="id_categoria" v-model="categoriaSelecionada">
                  <option v-for="ctg in categoria" :key="ctg.id" :value="ctg.id">{{ ctg.nome }}</option>
                </select>
              </div>

              <div class="input-box">
                  <label for="id_email">Email</label>
                  <input type="email" id="id_email" v-model="email" placeholder="Ex: joao@gmail.com">
              </div>

              <div class="input-box">
                  <label for="id_senha">Senha</label>
                  <input v-model="senha" type="password" id="id_senha">
              </div>
          </div>

          <div class="form-submit">
                  <button @click="returnarPag" class="button-return">Voltar</button>
                  <button @click="cadastrarPrestador">Cadastrar</button>
          </div>

      </div>

      <div class="form-footer">
          <p>© B1naryInspec | V.01</p>
      </div>
  </div>
  <ThePopUp></ThePopUp>
</template>

<script setup lang="ts">

import { onMounted, ref } from 'vue';
import ThePopUp from '../components/ThePopUp.vue';
import {exibirPopup} from '../components/ThePopUp.vue'
import axios from 'axios';

 // Capturando os valores dos campos
const categoria = ref([]);
const erro = ref();
const nome = ref("");
const cnpj = ref("");
const email = ref("");
const senha = ref("");
const token = localStorage.getItem('token')

~~~~
  
</details>

## 3. **Criação e configuração de rotas**
   - Contribuí ativamente com o desenvolvimento de rotas de navegação da aplicação front-end.

<details>
  <summary>Detalhes</summary>

  ~~~~typescript
const router = createRouter({
  history: createWebHistory(import.meta.env.BASE_URL),
  routes: [
    {
      path: '/',
      name: 'home',
      component: HomeView
    },
    {
      path: '/login',
      name: 'login',
      component: () => import('../views/Login.vue'),
      beforeEnter (_, __, next) { // Impede usuários não assinados
        if (!verifyTokenAcesso()) {       // de acessar a página Home.
          next();
          return;
        }
        next('/')
      }
    },
...
~~~~

</details>

## 4. **Requisições REST**
   - Contribuí com o desenvolvimento de requisições REST da aplicação.

<details>
  <summary>Detalhes</summary>

~~~~typescript
async function cadastrarPrestador() {
  // Verifique se uma categoria foi selecionada
  if (categoriaSelecionada.value === null) {
    alert('Selecione uma categoria antes de cadastrar.');
    return;
  }
    var usuarioId = await cadastrarUsuario();
  
  // Fazendo a requisição POST com os valores capturados
  try {
    
    await axios.post('http://localhost:8080/prestador', {
  
      prestadorNome: nome.value,
      cnpj: cnpj.value,
      usuarioId: usuarioId,
      segmentoId: categoriaSelecionada.value
  
    }, 
    {
      headers: {
          'Authorization': `Bearer ${token}` 
        }
    }
    );
    
    enviarEmailCredenciais(email.value, senha.value);
  
    // Requisição bem-sucedida, exibir um alerta de confirmação
    exibirPopup('Cadastro Realizado com Sucesso', 'Novo Prestador Registrado.', 123)
    limparCampos();
  
    
  } catch (error) {
    console.error('Ocorreu um erro ao cadastrar o prestador:', error);
    alert('Erro ao cadastrar o prestador.');
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
      <td>Typescript</td>
      <td>★★★★★☆</td>
    </tr>
    <tr>
      <td>VueJS</td>
      <td>★★★★☆☆</td>
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
      <td>★★★★☆☆</td>
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

</details>
