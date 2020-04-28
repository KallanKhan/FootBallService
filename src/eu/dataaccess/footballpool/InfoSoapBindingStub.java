/**
 * InfoSoapBindingStub.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package eu.dataaccess.footballpool;

public class InfoSoapBindingStub extends org.apache.axis.client.Stub implements eu.dataaccess.footballpool.InfoSoapType {
    private java.util.Vector cachedSerClasses = new java.util.Vector();
    private java.util.Vector cachedSerQNames = new java.util.Vector();
    private java.util.Vector cachedSerFactories = new java.util.Vector();
    private java.util.Vector cachedDeserFactories = new java.util.Vector();

    static org.apache.axis.description.OperationDesc [] _operations;

    static {
        _operations = new org.apache.axis.description.OperationDesc[34];
        _initOperationDesc1();
        _initOperationDesc2();
        _initOperationDesc3();
        _initOperationDesc4();
    }

    private static void _initOperationDesc1(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllCardsInfo");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftAllCardsInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TAllCardsInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllCardsInfoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tAllCardsInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[0] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllPlayerNames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "bSelected"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayerName"));
        oper.setReturnClass(eu.dataaccess.footballpool.TPlayerName[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllPlayerNamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerName"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[1] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllPlayersWithCards");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerCardInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTeamPlayerCardInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllPlayersWithCardsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[2] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllPlayersWithRole");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sRoleCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerName"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTeamPlayerName[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllPlayersWithRoleResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerName"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[3] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllStadiumInfo");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftStadiumInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TStadiumInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllStadiumInfoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tStadiumInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[4] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("AllTeamCoachNames");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamCoachName"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTeamCoachName[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllTeamCoachNamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamCoachName"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[5] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Cards");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "bYellow"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGameNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "CardsResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[6] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("CityNames");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "CityNamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[7] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Countries");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sCountryName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftCountry"));
        oper.setReturnClass(eu.dataaccess.footballpool.TCountry[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "CountriesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tCountry"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[8] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("FirstLastGamesEachLevel");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGameLevelInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TGameLevelInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "FirstLastGamesEachLevelResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameLevelInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[9] = oper;

    }

    private static void _initOperationDesc2(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GameIDsGroupedByCity");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGameIDsPerCity"));
        oper.setReturnClass(eu.dataaccess.footballpool.TGameIDsPerCity[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GameIDsGroupedByCityResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameIDsPerCity"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[10] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GameScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGameNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameResult"));
        oper.setReturnClass(eu.dataaccess.footballpool.TGameResult.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GameScoreResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[11] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GameTeamScore");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGameNumber"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iTeamId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GameTeamScoreResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[12] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GoalsScored");
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        oper.setReturnClass(int.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GoalsScoredResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[13] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GroupFirstGameDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sGroupCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        oper.setReturnClass(java.util.Date.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupFirstGameDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[14] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GroupInfo");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGroupInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TGroupInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupInfoResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[15] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GroupLastGameDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sGroupCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        oper.setReturnClass(java.util.Date.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupLastGameDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[16] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("GroupStandings");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGroupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGroupStanding"));
        oper.setReturnClass(eu.dataaccess.footballpool.TGroupStanding[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupStandingsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupStanding"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[17] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LevelFirstGameDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        oper.setReturnClass(java.util.Date.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "LevelFirstGameDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[18] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("LevelLastGameDate");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        oper.setReturnClass(java.util.Date.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "LevelLastGameDateResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[19] = oper;

    }

    private static void _initOperationDesc3(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("MatchDates");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfdate"));
        oper.setReturnClass(java.util.Date[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "MatchDatesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "date"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[20] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("NextGames");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftNextGame"));
        oper.setReturnClass(eu.dataaccess.footballpool.TNextGame[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "NextGamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tNextGame"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[21] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Players");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayer"));
        oper.setReturnClass(eu.dataaccess.footballpool.TPlayer[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayer"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[22] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PlayerRoles");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayerRole"));
        oper.setReturnClass(eu.dataaccess.footballpool.TPlayerRole[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayerRolesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerRole"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[23] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PlayersWithCardsRanked");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerCardRankInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayersWithCardsRankedResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardRankInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[24] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("PlayersWithGoalsRanked");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerGoalsRankInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayersWithGoalsRankedResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerGoalsRankInfo"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[25] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("ResultsAllGames");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iGroupId"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "iLevel"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"), int.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGameResult"));
        oper.setReturnClass(eu.dataaccess.footballpool.TGameResult[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ResultsAllGamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[26] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StadiumGoogleMapsURL");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sStadiumName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        oper.setReturnClass(java.lang.String.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "StadiumGoogleMapsURLResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[27] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StadiumInfo");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sStadiumName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tStadiumInfo"));
        oper.setReturnClass(eu.dataaccess.footballpool.TStadiumInfo.class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "StadiumInfoResult"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[28] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("StadiumNames");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfString"));
        oper.setReturnClass(java.lang.String[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "StadiumNamesResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "string"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[29] = oper;

    }

    private static void _initOperationDesc4(){
        org.apache.axis.description.OperationDesc oper;
        org.apache.axis.description.ParameterDesc param;
        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TeamIDsByGroup");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sGroupCode"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfInt"));
        oper.setReturnClass(int[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TeamIDsByGroupResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "int"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[30] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TeamPlayers");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "bSelected"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"), boolean.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayer"));
        oper.setReturnClass(eu.dataaccess.footballpool.TPlayer[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TeamPlayersResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayer"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[31] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("Teams");
        param = new org.apache.axis.description.ParameterDesc(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "sTeamName"), org.apache.axis.description.ParameterDesc.IN, new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"), java.lang.String.class, false, false);
        oper.addParameter(param);
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeam"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTeam[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TeamsResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeam"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[32] = oper;

        oper = new org.apache.axis.description.OperationDesc();
        oper.setName("TopScorersList");
        oper.setReturnType(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTopScorerTop5"));
        oper.setReturnClass(eu.dataaccess.footballpool.TTopScorerTop5[].class);
        oper.setReturnQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TopScorersListResult"));
        param = oper.getReturnParamDesc();
        param.setItemQName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTopScorerTop5"));
        oper.setStyle(org.apache.axis.constants.Style.WRAPPED);
        oper.setUse(org.apache.axis.constants.Use.LITERAL);
        _operations[33] = oper;

    }

    public InfoSoapBindingStub() throws org.apache.axis.AxisFault {
         this(null);
    }

    public InfoSoapBindingStub(java.net.URL endpointURL, javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
         this(service);
         super.cachedEndpoint = endpointURL;
    }

    public InfoSoapBindingStub(javax.xml.rpc.Service service) throws org.apache.axis.AxisFault {
        if (service == null) {
            super.service = new org.apache.axis.client.Service();
        } else {
            super.service = service;
        }
        ((org.apache.axis.client.Service)super.service).setTypeMappingVersion("1.2");
            java.lang.Class cls;
            javax.xml.namespace.QName qName;
            javax.xml.namespace.QName qName2;
            java.lang.Class beansf = org.apache.axis.encoding.ser.BeanSerializerFactory.class;
            java.lang.Class beandf = org.apache.axis.encoding.ser.BeanDeserializerFactory.class;
            java.lang.Class enumsf = org.apache.axis.encoding.ser.EnumSerializerFactory.class;
            java.lang.Class enumdf = org.apache.axis.encoding.ser.EnumDeserializerFactory.class;
            java.lang.Class arraysf = org.apache.axis.encoding.ser.ArraySerializerFactory.class;
            java.lang.Class arraydf = org.apache.axis.encoding.ser.ArrayDeserializerFactory.class;
            java.lang.Class simplesf = org.apache.axis.encoding.ser.SimpleSerializerFactory.class;
            java.lang.Class simpledf = org.apache.axis.encoding.ser.SimpleDeserializerFactory.class;
            java.lang.Class simplelistsf = org.apache.axis.encoding.ser.SimpleListSerializerFactory.class;
            java.lang.Class simplelistdf = org.apache.axis.encoding.ser.SimpleListDeserializerFactory.class;
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfdate");
            cachedSerQNames.add(qName);
            cls = java.util.Date[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "date");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfInt");
            cachedSerQNames.add(qName);
            cls = int[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "int");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOfString");
            cachedSerQNames.add(qName);
            cls = java.lang.String[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "string");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftAllCardsInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TAllCardsInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tAllCardsInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tAllCardsInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftCountry");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TCountry[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tCountry");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tCountry");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGameIDsPerCity");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGameIDsPerCity[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameIDsPerCity");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameIDsPerCity");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGameLevelInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGameLevelInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameLevelInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameLevelInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGameResult");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGameResult[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameResult");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameResult");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGroupInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGroupInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftGroupStanding");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGroupStanding[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupStanding");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupStanding");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftNextGame");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TNextGame[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tNextGame");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tNextGame");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayer");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TPlayer[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayer");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayer");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayerName");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TPlayerName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerName");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftPlayerRole");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TPlayerRole[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerRole");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerRole");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftStadiumInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TStadiumInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tStadiumInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tStadiumInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeam");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeam[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeam");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeam");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamCoachName");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamCoachName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamCoachName");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamCoachName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerCardInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerCardInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerCardRankInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardRankInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardRankInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerGoalsRankInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerGoalsRankInfo");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerGoalsRankInfo");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTeamPlayerName");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerName[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerName");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerName");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ArrayOftTopScorerTop5");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTopScorerTop5[].class;
            cachedSerClasses.add(cls);
            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTopScorerTop5");
            qName2 = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTopScorerTop5");
            cachedSerFactories.add(new org.apache.axis.encoding.ser.ArraySerializerFactory(qName, qName2));
            cachedDeserFactories.add(new org.apache.axis.encoding.ser.ArrayDeserializerFactory());

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tAllCardsInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TAllCardsInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tCountry");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TCountry.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameIDsPerCity");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGameIDsPerCity.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameLevelInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGameLevelInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGameResult");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGameResult.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGroupInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tGroupStanding");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TGroupStanding.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tNextGame");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TNextGame.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayer");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TPlayer.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerName");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TPlayerName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tPlayerRole");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TPlayerRole.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tStadiumInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TStadiumInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeam");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeam.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamCoachName");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamCoachName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerCardInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerCardRankInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerCardRankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerGoalsRankInfo");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTeamPlayerName");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTeamPlayerName.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

            qName = new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "tTopScorerTop5");
            cachedSerQNames.add(qName);
            cls = eu.dataaccess.footballpool.TTopScorerTop5.class;
            cachedSerClasses.add(cls);
            cachedSerFactories.add(beansf);
            cachedDeserFactories.add(beandf);

    }

    protected org.apache.axis.client.Call createCall() throws java.rmi.RemoteException {
        try {
            org.apache.axis.client.Call _call = super._createCall();
            if (super.maintainSessionSet) {
                _call.setMaintainSession(super.maintainSession);
            }
            if (super.cachedUsername != null) {
                _call.setUsername(super.cachedUsername);
            }
            if (super.cachedPassword != null) {
                _call.setPassword(super.cachedPassword);
            }
            if (super.cachedEndpoint != null) {
                _call.setTargetEndpointAddress(super.cachedEndpoint);
            }
            if (super.cachedTimeout != null) {
                _call.setTimeout(super.cachedTimeout);
            }
            if (super.cachedPortName != null) {
                _call.setPortName(super.cachedPortName);
            }
            java.util.Enumeration keys = super.cachedProperties.keys();
            while (keys.hasMoreElements()) {
                java.lang.String key = (java.lang.String) keys.nextElement();
                _call.setProperty(key, super.cachedProperties.get(key));
            }
            // All the type mapping information is registered
            // when the first call is made.
            // The type mapping information is actually registered in
            // the TypeMappingRegistry of the service, which
            // is the reason why registration is only needed for the first call.
            synchronized (this) {
                if (firstCall()) {
                    // must set encoding style before registering serializers
                    _call.setEncodingStyle(null);
                    for (int i = 0; i < cachedSerFactories.size(); ++i) {
                        java.lang.Class cls = (java.lang.Class) cachedSerClasses.get(i);
                        javax.xml.namespace.QName qName =
                                (javax.xml.namespace.QName) cachedSerQNames.get(i);
                        java.lang.Object x = cachedSerFactories.get(i);
                        if (x instanceof Class) {
                            java.lang.Class sf = (java.lang.Class)
                                 cachedSerFactories.get(i);
                            java.lang.Class df = (java.lang.Class)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                        else if (x instanceof javax.xml.rpc.encoding.SerializerFactory) {
                            org.apache.axis.encoding.SerializerFactory sf = (org.apache.axis.encoding.SerializerFactory)
                                 cachedSerFactories.get(i);
                            org.apache.axis.encoding.DeserializerFactory df = (org.apache.axis.encoding.DeserializerFactory)
                                 cachedDeserFactories.get(i);
                            _call.registerTypeMapping(cls, qName, sf, df, false);
                        }
                    }
                }
            }
            return _call;
        }
        catch (java.lang.Throwable _t) {
            throw new org.apache.axis.AxisFault("Failure trying to get the Call object", _t);
        }
    }

    public eu.dataaccess.footballpool.TAllCardsInfo[] allCardsInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[0]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllCardsInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TAllCardsInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TAllCardsInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TAllCardsInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TPlayerName[] allPlayerNames(boolean bSelected) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[1]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllPlayerNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(bSelected)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TPlayerName[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TPlayerName[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TPlayerName[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTeamPlayerCardInfo[] allPlayersWithCards() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[2]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllPlayersWithCards"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTeamPlayerCardInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTeamPlayerCardInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTeamPlayerCardInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTeamPlayerName[] allPlayersWithRole(java.lang.String sTeamName, java.lang.String sRoleCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[3]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllPlayersWithRole"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sTeamName, sRoleCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTeamPlayerName[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTeamPlayerName[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTeamPlayerName[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TStadiumInfo[] allStadiumInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[4]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllStadiumInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TStadiumInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TStadiumInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TStadiumInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTeamCoachName[] allTeamCoachNames() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[5]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "AllTeamCoachNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTeamCoachName[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTeamCoachName[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTeamCoachName[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int cards(boolean bYellow, int iGameNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[6]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "Cards"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Boolean(bYellow), new java.lang.Integer(iGameNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] cityNames() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[7]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "CityNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TCountry[] countries(java.lang.String sCountryName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[8]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "Countries"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sCountryName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TCountry[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TCountry[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TCountry[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TGameLevelInfo[] firstLastGamesEachLevel() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[9]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "FirstLastGamesEachLevel"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TGameLevelInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TGameLevelInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TGameLevelInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TGameIDsPerCity[] gameIDsGroupedByCity() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[10]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GameIDsGroupedByCity"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TGameIDsPerCity[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TGameIDsPerCity[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TGameIDsPerCity[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TGameResult gameScore(int iGameNumber) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[11]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GameScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(iGameNumber)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TGameResult) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TGameResult) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TGameResult.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int gameTeamScore(int iGameNumber, int iTeamId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[12]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GameTeamScore"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(iGameNumber), new java.lang.Integer(iTeamId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int goalsScored() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[13]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GoalsScored"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return ((java.lang.Integer) _resp).intValue();
            } catch (java.lang.Exception _exception) {
                return ((java.lang.Integer) org.apache.axis.utils.JavaUtils.convert(_resp, int.class)).intValue();
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Date groupFirstGameDate(java.lang.String sGroupCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[14]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupFirstGameDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sGroupCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Date) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Date.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TGroupInfo[] groupInfo() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[15]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TGroupInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TGroupInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TGroupInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Date groupLastGameDate(java.lang.String sGroupCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[16]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupLastGameDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sGroupCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Date) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Date.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TGroupStanding[] groupStandings(int iGroupId) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[17]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "GroupStandings"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(iGroupId)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TGroupStanding[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TGroupStanding[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TGroupStanding[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Date levelFirstGameDate(int iLevel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[18]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "LevelFirstGameDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(iLevel)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Date) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Date.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Date levelLastGameDate(int iLevel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[19]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "LevelLastGameDate"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(iLevel)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Date) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Date) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Date.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.util.Date[] matchDates() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[20]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "MatchDates"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.util.Date[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.util.Date[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.util.Date[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TNextGame[] nextGames() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[21]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "NextGames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TNextGame[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TNextGame[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TNextGame[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TPlayer[] players(java.lang.String sName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[22]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "Players"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TPlayer[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TPlayer[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TPlayer[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TPlayerRole[] playerRoles() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[23]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayerRoles"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TPlayerRole[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TPlayerRole[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TPlayerRole[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[] playersWithCardsRanked() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[24]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayersWithCardsRanked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTeamPlayerCardRankInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[] playersWithGoalsRanked() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[25]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "PlayersWithGoalsRanked"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTeamPlayerGoalsRankInfo[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TGameResult[] resultsAllGames(int iGroupId, int iLevel) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[26]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "ResultsAllGames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {new java.lang.Integer(iGroupId), new java.lang.Integer(iLevel)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TGameResult[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TGameResult[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TGameResult[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String stadiumGoogleMapsURL(java.lang.String sStadiumName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[27]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "StadiumGoogleMapsURL"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sStadiumName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TStadiumInfo stadiumInfo(java.lang.String sStadiumName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[28]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "StadiumInfo"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sStadiumName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TStadiumInfo) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TStadiumInfo) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TStadiumInfo.class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public java.lang.String[] stadiumNames() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[29]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "StadiumNames"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (java.lang.String[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (java.lang.String[]) org.apache.axis.utils.JavaUtils.convert(_resp, java.lang.String[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public int[] teamIDsByGroup(java.lang.String sGroupCode) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[30]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TeamIDsByGroup"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sGroupCode});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (int[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (int[]) org.apache.axis.utils.JavaUtils.convert(_resp, int[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TPlayer[] teamPlayers(java.lang.String sTeamName, boolean bSelected) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[31]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TeamPlayers"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sTeamName, new java.lang.Boolean(bSelected)});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TPlayer[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TPlayer[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TPlayer[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTeam[] teams(java.lang.String sTeamName) throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[32]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "Teams"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {sTeamName});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTeam[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTeam[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTeam[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

    public eu.dataaccess.footballpool.TTopScorerTop5[] topScorersList() throws java.rmi.RemoteException {
        if (super.cachedEndpoint == null) {
            throw new org.apache.axis.NoEndPointException();
        }
        org.apache.axis.client.Call _call = createCall();
        _call.setOperation(_operations[33]);
        _call.setUseSOAPAction(true);
        _call.setSOAPActionURI("");
        _call.setEncodingStyle(null);
        _call.setProperty(org.apache.axis.client.Call.SEND_TYPE_ATTR, Boolean.FALSE);
        _call.setProperty(org.apache.axis.AxisEngine.PROP_DOMULTIREFS, Boolean.FALSE);
        _call.setSOAPVersion(org.apache.axis.soap.SOAPConstants.SOAP11_CONSTANTS);
        _call.setOperationName(new javax.xml.namespace.QName("https://footballpool.dataaccess.eu", "TopScorersList"));

        setRequestHeaders(_call);
        setAttachments(_call);
 try {        java.lang.Object _resp = _call.invoke(new java.lang.Object[] {});

        if (_resp instanceof java.rmi.RemoteException) {
            throw (java.rmi.RemoteException)_resp;
        }
        else {
            extractAttachments(_call);
            try {
                return (eu.dataaccess.footballpool.TTopScorerTop5[]) _resp;
            } catch (java.lang.Exception _exception) {
                return (eu.dataaccess.footballpool.TTopScorerTop5[]) org.apache.axis.utils.JavaUtils.convert(_resp, eu.dataaccess.footballpool.TTopScorerTop5[].class);
            }
        }
  } catch (org.apache.axis.AxisFault axisFaultException) {
  throw axisFaultException;
}
    }

}
