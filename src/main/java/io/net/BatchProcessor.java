package io.net;

/**
 * Created by joaop on 22/12/2016.
 */
public interface BatchProcessor<ProcessedData> {
    ProcessedData batchProcess(String input, ProcessorUnit processorUnit);
}
