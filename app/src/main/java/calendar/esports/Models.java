package calendar.esports;
import java.io.Serializable;
import java.util.Date;
import java.util.concurrent.atomic.AtomicInteger;

class Match implements Serializable, Comparable<Match>{
    private Integer id;
    private String name;
    private Date begin_at;
    private League league;
    private Opponents[] opponents;
    private Result[] results;

    public Match(Integer id, String name, Date begin_at, League league, Opponents[] opponents, Result[] results) {
        this.id = id;
        this.name = name;
        this.begin_at = begin_at;
        this.league = league;
        this.opponents = opponents;
        this.results = results;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBegin_at() {
        return begin_at;
    }

    public void setBegin_at(Date begin_at) {
        this.begin_at = begin_at;
    }

    public Opponents[] getOpponents() {
        return opponents;
    }

    public void setOpponents(Opponents[] opponents) {
        this.opponents = opponents;
    }

    public Result[] getResults() {
        return results;
    }

    public void setResults(Result[] results) {
        this.results = results;
    }

    @Override
    public int compareTo(Match m) {
        return getBegin_at().compareTo(m.getBegin_at());
    }

    public League getLeague() {
        return league;
    }

    public void setLeague(League league) {
        this.league = league;
    }
}

class Opponents implements Serializable{
    private String type;
    private Team opponent;

    public Opponents(String type, Team opponent) {
        this.type = type;
        this.opponent = opponent;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Team getOpponent() {
        return opponent;
    }

    public void setOpponent(Team opponent) {
        this.opponent = opponent;
    }
}

class Team implements Serializable{
    private Integer  id;
    private String   image_url;
    private String   slug;
    private String   name;
    private Player[] players;

    public Team(Integer id, String image_url, String slug, String name, Player[] players) {
        this.id        = id;
        this.image_url = image_url;
        this.slug      = slug;
        this.name      = name;
        this.players   = players;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }

    public String getSlug() {
        return slug;
    }

    public void setSlug(String slug) {
        this.slug = slug;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Player[] getPlayers() {
        return players;
    }

    public void setPlayers(Player[] players) {
        this.players = players;
    }

}

class Result implements Serializable{
    private Integer team_id;
    private Integer score;

    public Result(Integer team_id, Integer score) {
        this.team_id = team_id;
        this.score = score;
    }

    public Integer getTeam_id() {
        return team_id;
    }

    public void setTeam_id(Integer id) {
        this.team_id = id;
    }

    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }
}

class League implements Serializable{
    private Integer id;
    private String  name;
    private String  image_url;

    public League(Integer id, String name, String image_url) {
        this.id = id;
        this.name = name;
        this.image_url = image_url;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String image_url) {
        this.image_url = image_url;
    }
}

class Player implements Serializable{
    private int    id;
    private String name;
    private String image_url;
    private String role;

    public Player(int id, String name, String image_url, String role) {
        this.id = id;
        this.name = name;
        this.image_url = image_url;
        this.role = role;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getImage_url() {
        return image_url;
    }

    public void setImage_url(String img_url) {
        this.image_url = img_url;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}


class NotificationID {
    private final static AtomicInteger c = new AtomicInteger(0);
    public static int getID() {
        return c.incrementAndGet();
    }
}