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

/**
 * Clase abstracta que representa al objeto mediador
 * del patrón de comportamiento Mediator
 *
 * @author Juan Pablo Camussi
 * @version 1.0.0
 */
public abstract class Mediator {
    /**
     * Añade un nuevo objeto del tipo Colleague si este aún no fue registrado
     * @param colleague Objeto del tipo {@link Colleague} que será agregado al registro del mediador
     */
    public abstract void registerColleague(Colleague colleague);

    /**
     * Envía la palabra (word), recibida por parte de unos de los colegas, a los demás
     * colegas registrados en el mediador con el fin de que la agreguen a su propio almacén
     * @param colleague Objeto {@link Colleague} que aporta la <b>palabra (word)</b> a ser reenviada
     * @param word {@link String} La palabra que será reenviada
     */
    protected abstract void sendNewWord(Colleague colleague, String word);
}
