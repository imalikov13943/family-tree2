package familytree2.study_group.controller;

import java.util.List;

import familytree2.study_group.stream.Stream;
import familytree2.study_group.stream.StreamService;

public class Controller {
    private StreamService streamService;

    public Controller() {
        this.streamService = new StreamService();
    }

    public void sortStreams(List<Stream> streams) {
        streamService.sortStreams(streams);
    }
}
