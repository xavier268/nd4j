package org.nd4j.autodiff.graph.api;

import lombok.AllArgsConstructor;
import lombok.Data;

/** Vertex in a graph
 *
 * @param <T> the type of the value/object associated with the vertex
 */
@AllArgsConstructor
@Data

public class Vertex<T> {

    protected final int idx;
    protected final T value;

    public int vertexID() {
        return idx;
    }

    public T getValue() {
        return value;
    }

}
