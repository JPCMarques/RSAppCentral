package io.net;

/**
 * Created by joaop on 22/12/2016.
 */
public interface ProcessorUnit<ProcessedData> {
    ProcessedData process(String input);
}
