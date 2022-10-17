/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.outleet_tenis;

import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextField;
import java.time.LocalDate;
import javax.swing.JOptionPane;


/**
 *
 * @author Honorato
 */
public class Compra {
    
    private String nome_cliente;
    private String id_cliente;
    private String nome_produto;
    private float valor;
    private LocalDate data_compra;

        public String getNome_cliente() {
        return nome_cliente;
    }

    public void setNome_cliente(String nome_cliente) {
        this.nome_cliente = nome_cliente;
    }
    
    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getNome_produto() {
        return nome_produto;
    }

    public void setNome_produto(String nome_produto) {
        this.nome_produto = nome_produto;
    }

    public float getValor() {
        return valor;
    }

    public void setValor(float valor) {
        this.valor = valor;
    }

    public LocalDate getData_compra() {
        return data_compra;
    }

    public void setData_compra(LocalDate data_compra) {
        this.data_compra = data_compra;
    }
    
    
    public void compra(String nome_cliente, String id_cliente, String nome_produto, float valor, LocalDate data_compra ){
       
        File arquivoCSV = new File("C:\\Users\\Honorato\\Documents\\NetBeansProjects\\Outleet_Tenis\\src\\main\\java\\com\\mycompany\\outleet_tenis\\compra.csv");
        
        System.out.println(nome_cliente + id_cliente + data_compra);
        
        try{          
            // - lista que irá receber todos valores do csv
            List<String> itens = new ArrayList(); 
            
            //variavel para receber as linhas por linhas 
            String linhasDoArquivo = new String();           
            Scanner leitor = new Scanner(arquivoCSV);
            
            //Correr todas as linhas do arquivo
            while (leitor.hasNext()){
                
                linhasDoArquivo = leitor.nextLine();
                itens.add(linhasDoArquivo);
            }
            
            //incremento do novo índice na lista que contém os itens do csv
            
            
            //criação de novo objeto para escrever os novos valores
            PrintWriter pw = new PrintWriter(new File("C:\\Users\\Honorato\\Documents\\NetBeansProjects\\Outleet_Tenis\\src\\main\\java\\com\\mycompany\\outleet_tenis\\compra.csv"));
            
            //Criação da lista para aplicar os valores no csv
            StringBuilder sb=new StringBuilder();
            
            //laço para inserir linha(indice) por linha
            for (String lin : itens){
                sb.append(lin);
                sb.append("\r\n");
            }
            
            //objeto adicionar os valores no arquivo
            pw.write(sb.toString());
            
            //frcha conexão com arquivo
            pw.close();
            
            //mensagem de aviso
            System.out.println("Atualizado");
            
        }catch(FileNotFoundException e){
            
        }
    }
    
}
