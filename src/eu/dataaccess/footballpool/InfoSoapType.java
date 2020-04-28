/**
 * InfoSoapType.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public interface InfoSoapType extends java.rmi.Remote {

    /**
     * Returns an array with the information about the given yellow
     * and red cards in all games. What date, minute, teams that were playing
     * and player name
     */
    public eu.dataaccess.footballpool.TAllCardsInfo[] allCardsInfo() throws java.rmi.RemoteException;

    /**
     * Returns an array with the id, name, country and flag reference
     * of all players
     */
    public eu.dataaccess.footballpool.TPlayerName[] allPlayerNames(boolean bSelected) throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all players that have a
     * yellow or a red card. The number of yellow and red cards is returned.
     */
    public eu.dataaccess.footballpool.TTeamPlayerCardInfo[] allPlayersWithCards() throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all players that have the
     * passed player role. If you pass a team name the result will be filtered
     * on that team
     */
    public eu.dataaccess.footballpool.TTeamPlayerName[] allPlayersWithRole(java.lang.String sTeamName, java.lang.String sRoleCode) throws java.rmi.RemoteException;

    /**
     * Returns an array with the information stored about all stadiums.
     * The array contains the names, the city where the stadium can be found,
     * the seat capacity, the google maps and wikipedia URLs
     */
    public eu.dataaccess.footballpool.TStadiumInfo[] allStadiumInfo() throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all the coaches and the
     * team name he/she is coaching
     */
    public eu.dataaccess.footballpool.TTeamCoachName[] allTeamCoachNames() throws java.rmi.RemoteException;

    /**
     * Returns the total number of red or yellow cards given for all
     * games (iGameNumber < 1) or a specific game
     */
    public int cards(boolean bYellow, int iGameNumber) throws java.rmi.RemoteException;

    /**
     * Returns an array with all the city names where games are played
     */
    public java.lang.String[] cityNames() throws java.rmi.RemoteException;

    /**
     * Get the top 25 countries starting with or containing the value
     * of sName
     */
    public eu.dataaccess.footballpool.TCountry[] countries(java.lang.String sCountryName) throws java.rmi.RemoteException;

    /**
     * Returns an array with a play levels and per level the start
     * and end game date and ID
     */
    public eu.dataaccess.footballpool.TGameLevelInfo[] firstLastGamesEachLevel() throws java.rmi.RemoteException;

    /**
     * Returns an array of Game IDs grouped by City Name
     */
    public eu.dataaccess.footballpool.TGameIDsPerCity[] gameIDsGroupedByCity() throws java.rmi.RemoteException;

    /**
     * Returns the results of a given game (pass the game ID)
     */
    public eu.dataaccess.footballpool.TGameResult gameScore(int iGameNumber) throws java.rmi.RemoteException;

    /**
     * Returns the score for a team in a game
     */
    public int gameTeamScore(int iGameNumber, int iTeamId) throws java.rmi.RemoteException;

    /**
     * Returns the total number of goals scored
     */
    public int goalsScored() throws java.rmi.RemoteException;

    /**
     * Returns the date of the first game in this group
     */
    public java.util.Date groupFirstGameDate(java.lang.String sGroupCode) throws java.rmi.RemoteException;

    /**
     * Returns a list of groups (poule phase and later round of 16
     * etc) and the information such as name and date first and last game
     */
    public eu.dataaccess.footballpool.TGroupInfo[] groupInfo() throws java.rmi.RemoteException;

    /**
     * Returns the date of the last game in this group
     */
    public java.util.Date groupLastGameDate(java.lang.String sGroupCode) throws java.rmi.RemoteException;

    /**
     * Returns an the standings in each group by passing the group
     * ID
     */
    public eu.dataaccess.footballpool.TGroupStanding[] groupStandings(int iGroupId) throws java.rmi.RemoteException;

    /**
     * Returns the date of the first game in this level
     */
    public java.util.Date levelFirstGameDate(int iLevel) throws java.rmi.RemoteException;

    /**
     * Returns the date of the last game in this level
     */
    public java.util.Date levelLastGameDate(int iLevel) throws java.rmi.RemoteException;

    /**
     * Returns a list with tournament dates
     */
    public java.util.Date[] matchDates() throws java.rmi.RemoteException;

    /**
     * Returns an array with the next games of date that is greater
     * than or equal to today. Only games of one day are returned.
     */
    public eu.dataaccess.footballpool.TNextGame[] nextGames() throws java.rmi.RemoteException;

    /**
     * Get the top 10 players where name, fullname, firstname or lastname
     * contains the value of sName
     */
    public eu.dataaccess.footballpool.TPlayer[] players(java.lang.String sName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the roles a player can have (defender
     * etc)
     */
    public eu.dataaccess.footballpool.TPlayerRole[] playerRoles() throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all players that have a
     * yellow or a red card. The number of yellow and red cards is returned.
     */
    public eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[] playersWithCardsRanked() throws java.rmi.RemoteException;

    /**
     * Returns an array with the names of all players that have scored
     * a goal.
     */
    public eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[] playersWithGoalsRanked() throws java.rmi.RemoteException;

    /**
     * Returns game result of all games overall, in one group or at
     * one level. When groupid < 1 all games are processed (optionally filtered
     * by level). A ID or level can be retrieved via GroupInfo.
     */
    public eu.dataaccess.footballpool.TGameResult[] resultsAllGames(int iGroupId, int iLevel) throws java.rmi.RemoteException;

    /**
     * Returns a URL that can be used to show a small map of the stadium
     */
    public java.lang.String stadiumGoogleMapsURL(java.lang.String sStadiumName) throws java.rmi.RemoteException;

    /**
     * Returns the information stored about a particular stadium.
     * For that pass the exact name of the stadium
     */
    public eu.dataaccess.footballpool.TStadiumInfo stadiumInfo(java.lang.String sStadiumName) throws java.rmi.RemoteException;

    /**
     * Returns an array of stadium names where the games are played
     */
    public java.lang.String[] stadiumNames() throws java.rmi.RemoteException;

    /**
     * Returns a list of team IDs based on passed GroupCode (e.g A
     * or H)
     */
    public int[] teamIDsByGroup(java.lang.String sGroupCode) throws java.rmi.RemoteException;

    /**
     * Get the players of a team. This is the current squad.
     */
    public eu.dataaccess.footballpool.TPlayer[] teamPlayers(java.lang.String sTeamName, boolean bSelected) throws java.rmi.RemoteException;

    /**
     * Get the top 10 teams starting with or containing the value
     * of sTeamName
     */
    public eu.dataaccess.footballpool.TTeam[] teams(java.lang.String sTeamName) throws java.rmi.RemoteException;

    /**
     * Returns an array with the 5 best performing players.
     */
    public eu.dataaccess.footballpool.TTopScorerTop5[] topScorersList() throws java.rmi.RemoteException;
}
