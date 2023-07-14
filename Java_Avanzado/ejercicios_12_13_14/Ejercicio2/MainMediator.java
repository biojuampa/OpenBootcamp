/*
 * Copyright © 2023 <copyright holders>
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and associated
 * documentation files (the “Software”), to deal in the Software without restriction, including without limitation
 * the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies of the Software, and
 * to permit persons to whom the Software is furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial portions of
 * the Software.
 *
 * THE SOFTWARE IS PROVIDED “AS IS”, WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED, INCLUDING BUT NOT
 * LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT.
 * IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY,
 * WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 *
 */

import mediator.*;

/**
 * Clase principal en la que se hace uso de las virtudes del paquete mediator.
 * Las clases que hagan uso de este paquete deberían estar fuera del directorio
 * del mismo e importarlo para que así funcione correctamente la encapsulación.
 * @author Juan Pablo Camussi
 * @version 1.0.0
*/
public class MainMediator {
    public static void main(String[] args) {
        // Creo el mediador concreto
        Mediator mediator = new ArraysMediator();

        // Creo los colegas concretos
        Colleague arrayListColleague = new ArrayListColleague();
        Colleague linkedListColleague = new LinkedListColleague();
        Colleague vectorColleague = new VectorColleague();
        Colleague fileDiskColleague = new FileDiskColleague();

        // Registro los colegas en el mediador
        mediator.registerColleague(arrayListColleague);
        mediator.registerColleague(linkedListColleague);
        mediator.registerColleague(vectorColleague);
        mediator.registerColleague(fileDiskColleague);

        // Cada colega agrega una palabra con su nombre
        arrayListColleague.addNewWord("ArrayList");
        arrayListColleague.addNewWord("ArrayList");
        linkedListColleague.addNewWord("LinkedList");
        linkedListColleague.addNewWord("LinkedList");
        linkedListColleague.addNewWord("LinkedList");
        vectorColleague.addNewWord("Vector");
        vectorColleague.addNewWord("Vector");
        vectorColleague.addNewWord("Vector");
        vectorColleague.addNewWord("Vector");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");
        fileDiskColleague.addNewWord("File Disk");

        // Imprimo por pantalla el almacén de cada uno de los colegas (los cuales deberían ser idénticos)
        System.out.println("ArrayList \t->\t" + arrayListColleague.getAll());
        System.out.println("LinkedList \t->\t" + linkedListColleague.getAll());
        System.out.println("Vector \t\t->\t" + vectorColleague.getAll());
        System.out.println("File Disk \t->\t" + fileDiskColleague.getAll());
    }
}
