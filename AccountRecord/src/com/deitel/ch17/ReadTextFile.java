/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.deitel.ch17;

import java. io. File;
import java. io. FileNotFoundException;
import java. lang.IllegalStateException;
import java.util. NoSuchElementException;
import java.util.Scanner;

import com.deitel.ch17.AccountRecord;

public class ReadTextFile {
    
    private Scanner input;

    // permite ao usuário abrir o arquivo
    public void openFile(){
        try
        {
            input = new Scanner( new File( "clients.txt" ) );
        } // fim do try
        catch ( FileNotFoundException fileNotFoundException )
        {
            System.err.println( "Error opening file." );
            System.exit( 1);
        } // fim do catch
    } // fim do método openFile

        // lê o registro no arquivo
        public void readRecords ()
        {

            // objeto a ser gravado na tela
            AccountRecord record = new AccountRecord();

            System.out.printf( "%-10s%-12s%-12s%10s\n", "Account",
            "First Name", "Last Name", "Balance" );

            try // lê os registros no arquivo utilizando o objeto Scanner
            {
                while (input.hasNext() ) 
                {
                    record.setAccount( input.nextInt() ); // lê o número de conta
                    record.setFirstName( input.next() ); // lê o primeiro nome
                    record.setLastName( input.next() ); // lê o sobrenome
                    record.setBalance( input.nextDouble() ); // lê o saldo
                    // exibe o conteúdo de registro
                    System.out.printf( "%-10d%-12s%-12s%10.2f\n",
                    record.getAccount(), record.getFirstName(),
                    record.getLastName(), record.getBalance() );
                } // fim do while
            } // fim do try
            catch ( NoSuchElementException elementException )
            {
                System.err.println( "File improperly formed." );
                input.close();
                System.exit( 1);
            }
            catch ( IllegalStateException stateException )
            {
                System.err.println( "Error reading from file." );
                System.exit( 1);
            } // fim do catch
        } // fim do método readRecords
        
        public void closeFile()
        {
            if(input != null)
                input.close();
        }

}
