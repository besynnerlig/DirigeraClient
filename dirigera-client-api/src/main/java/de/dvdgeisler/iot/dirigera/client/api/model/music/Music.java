package de.dvdgeisler.iot.dirigera.client.api.model.music;

import java.util.List;

public class Music {
    public List<MusicPlayList> playlists;
    public List<String> favorites;

    public Music() {
    }

    public Music(final List<MusicPlayList> playlists, final List<String> favorites) {
        this.playlists = playlists;
        this.favorites = favorites;
    }
}
