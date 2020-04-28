package eu.dataaccess.footballpool;

public class InfoSoapTypeProxy implements eu.dataaccess.footballpool.InfoSoapType {
  private String _endpoint = null;
  private eu.dataaccess.footballpool.InfoSoapType infoSoapType = null;
  
  public InfoSoapTypeProxy() {
    _initInfoSoapTypeProxy();
  }
  
  public InfoSoapTypeProxy(String endpoint) {
    _endpoint = endpoint;
    _initInfoSoapTypeProxy();
  }
  
  private void _initInfoSoapTypeProxy() {
    try {
      infoSoapType = (new eu.dataaccess.footballpool.InfoLocator()).getInfoSoap();
      if (infoSoapType != null) {
        if (_endpoint != null)
          ((javax.xml.rpc.Stub)infoSoapType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
        else
          _endpoint = (String)((javax.xml.rpc.Stub)infoSoapType)._getProperty("javax.xml.rpc.service.endpoint.address");
      }
      
    }
    catch (javax.xml.rpc.ServiceException serviceException) {}
  }
  
  public String getEndpoint() {
    return _endpoint;
  }
  
  public void setEndpoint(String endpoint) {
    _endpoint = endpoint;
    if (infoSoapType != null)
      ((javax.xml.rpc.Stub)infoSoapType)._setProperty("javax.xml.rpc.service.endpoint.address", _endpoint);
    
  }
  
  public eu.dataaccess.footballpool.InfoSoapType getInfoSoapType() {
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType;
  }
  
  public eu.dataaccess.footballpool.TAllCardsInfo[] allCardsInfo() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allCardsInfo();
  }
  
  public eu.dataaccess.footballpool.TPlayerName[] allPlayerNames(boolean bSelected) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayerNames(bSelected);
  }
  
  public eu.dataaccess.footballpool.TTeamPlayerCardInfo[] allPlayersWithCards() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayersWithCards();
  }
  
  public eu.dataaccess.footballpool.TTeamPlayerName[] allPlayersWithRole(java.lang.String sTeamName, java.lang.String sRoleCode) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allPlayersWithRole(sTeamName, sRoleCode);
  }
  
  public eu.dataaccess.footballpool.TStadiumInfo[] allStadiumInfo() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allStadiumInfo();
  }
  
  public eu.dataaccess.footballpool.TTeamCoachName[] allTeamCoachNames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.allTeamCoachNames();
  }
  
  public int cards(boolean bYellow, int iGameNumber) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.cards(bYellow, iGameNumber);
  }
  
  public java.lang.String[] cityNames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.cityNames();
  }
  
  public eu.dataaccess.footballpool.TCountry[] countries(java.lang.String sCountryName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.countries(sCountryName);
  }
  
  public eu.dataaccess.footballpool.TGameLevelInfo[] firstLastGamesEachLevel() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.firstLastGamesEachLevel();
  }
  
  public eu.dataaccess.footballpool.TGameIDsPerCity[] gameIDsGroupedByCity() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gameIDsGroupedByCity();
  }
  
  public eu.dataaccess.footballpool.TGameResult gameScore(int iGameNumber) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gameScore(iGameNumber);
  }
  
  public int gameTeamScore(int iGameNumber, int iTeamId) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.gameTeamScore(iGameNumber, iTeamId);
  }
  
  public int goalsScored() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.goalsScored();
  }
  
  public java.util.Date groupFirstGameDate(java.lang.String sGroupCode) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groupFirstGameDate(sGroupCode);
  }
  
  public eu.dataaccess.footballpool.TGroupInfo[] groupInfo() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groupInfo();
  }
  
  public java.util.Date groupLastGameDate(java.lang.String sGroupCode) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groupLastGameDate(sGroupCode);
  }
  
  public eu.dataaccess.footballpool.TGroupStanding[] groupStandings(int iGroupId) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.groupStandings(iGroupId);
  }
  
  public java.util.Date levelFirstGameDate(int iLevel) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.levelFirstGameDate(iLevel);
  }
  
  public java.util.Date levelLastGameDate(int iLevel) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.levelLastGameDate(iLevel);
  }
  
  public java.util.Date[] matchDates() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.matchDates();
  }
  
  public eu.dataaccess.footballpool.TNextGame[] nextGames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.nextGames();
  }
  
  public eu.dataaccess.footballpool.TPlayer[] players(java.lang.String sName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.players(sName);
  }
  
  public eu.dataaccess.footballpool.TPlayerRole[] playerRoles() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.playerRoles();
  }
  
  public eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[] playersWithCardsRanked() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.playersWithCardsRanked();
  }
  
  public eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[] playersWithGoalsRanked() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.playersWithGoalsRanked();
  }
  
  public eu.dataaccess.footballpool.TGameResult[] resultsAllGames(int iGroupId, int iLevel) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.resultsAllGames(iGroupId, iLevel);
  }
  
  public java.lang.String stadiumGoogleMapsURL(java.lang.String sStadiumName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.stadiumGoogleMapsURL(sStadiumName);
  }
  
  public eu.dataaccess.footballpool.TStadiumInfo stadiumInfo(java.lang.String sStadiumName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.stadiumInfo(sStadiumName);
  }
  
  public java.lang.String[] stadiumNames() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.stadiumNames();
  }
  
  public int[] teamIDsByGroup(java.lang.String sGroupCode) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.teamIDsByGroup(sGroupCode);
  }
  
  public eu.dataaccess.footballpool.TPlayer[] teamPlayers(java.lang.String sTeamName, boolean bSelected) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.teamPlayers(sTeamName, bSelected);
  }
  
  public eu.dataaccess.footballpool.TTeam[] teams(java.lang.String sTeamName) throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.teams(sTeamName);
  }
  
  public eu.dataaccess.footballpool.TTopScorerTop5[] topScorersList() throws java.rmi.RemoteException{
    if (infoSoapType == null)
      _initInfoSoapTypeProxy();
    return infoSoapType.topScorersList();
  }
  
  
}