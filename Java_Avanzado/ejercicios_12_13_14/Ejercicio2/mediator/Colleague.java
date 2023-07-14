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

package mediator;

import java.util.ArrayList;

/**
 * Clase abstracta que representa al objeto {@link Colleague} (colega)
 * del patrón de comportamiento {@link Mediator}
 * @author Juan Pablo Camussi
 * @version 1.0.0
 */
public abstract class Colleague {
    /**
     * Atributo que le permite al {@link Colleague} saber quién es su {@link Mediator}
     */
    private Mediator mediator;


    protected final void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    /**
     * Método implementado completamente en esta clase abstracta, que será la clase
     * <b>padre</b> de todos los colegas que la hereden. Se utiliza para agregar una
     * nueva <b>palabra (word)</b> al almacén de un colega, y a su vez, llama al mediador
     * con el cual se registró para pasarle dicha palabra a fin de <i>distribuirla</i>
     * entre los demás colegas
     * @param word {@link String} <b>Palabra (word)</b> a ser almacenada
     */
    public final void addNewWord(String word) {
        insertWord(word);
        mediator.sendNewWord(this, word);
    }

    /**
     * Método que deberá ser implementado por cada colega en particular conforme al
     * tipo de almacenamiento que maneje
     * @param word {@link String} <b>Palabra (word)</b> a ser agregada al almacenamiento del colega
     */
    protected abstract void insertWord(String word);

    /**
     * Método que permite obtener la colección completa de las palabras almacenadas.
     * Independientemente del tipo de almacenamiento usado por el colega, siempre
     * se devolverá un {@link ArrayList} con los valores almacenados.
     * @return {@link ArrayList} de {@link String} con los valores guardados
     */
    public abstract ArrayList<String> getAll();
}
