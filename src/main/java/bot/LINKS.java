package bot;

import java.util.StringJoiner;

public enum LINKS {

    WEB(web()),
    TEAM_LINKEDIN(linkedIn()),
    PARTNERS(partners()),
    BUYLINKS(contractsAndBuys()),
    DEXTOOL(dexTool()),
    LATESTTWEETS(latestTweets()),
    TWITTER(twitter()),
    ROADMAP(roadMap());

    public final String value;

    LINKS(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }

    private static String partners() {
        return new StringJoiner("\n" + "------> ", "------> ", "")
                .add(addHrefAndText("https://blog.congruentlabs.co/signata-will-leverage-chainlink-oracles-to-power-its-on-chain-identity-management-system", "Signata x Link"))
                .add(addHrefAndText("https://blog.congruentlabs.co/announcing-signata-partnership-with-aggregated-finance", "Signata x Aggregated Finance"))
                .add(addHrefAndText("https://blog.congruentlabs.co/announcing-signata-partnership-with-lgcy-network", "Signata x Lgcy Network"))
                .add(addHrefAndText("https://blog.congruentlabs.co/announcing-partnership-with-upsurge-studios", "Signata x Upserge Studios"))
                .add(addHrefAndText("https://medium.com/ferrumnetwork/announcing-the-next-staking-project-signata-frm-buyback-c702e5b01725", "Signata x Ferrum Network"))
                .toString();
    }

    private static String linkedIn() {
        return new StringJoiner("\n" + "------> ", "------> ", "")
                .add("<a href='https://www.linkedin.com/in/timothy-quinn'><b>Timothy Quinn</b></a>")
                .add("<a href='https://www.linkedin.com/in/benjamin-burrough-86642120b'><b>Benjamin Burrough</b></a>")
                .toString();

    }


    private static String roadMap() {
        return "------> " + addHrefAndText("https://trello.com/b/IJVDJZ39/sata-roadmap", "Signata roadmap");
    }

    private static String web() {
        return "------> " + addHrefAndText("https://sata.technology/", "Signata website");
    }

    private static String contractsAndBuys() {
        return new StringJoiner("\n" + "------> ", "------> ", "")
                .add(makeBoldText("ERC") + " :" + " 0x3ebb4a4e91ad83be51f8d596533818b246f4bee1  "
                        + addHrefAndText("https://app.uniswap.org/#/swap?inputCurrency=ETH&outputCurrency=0x3ebb4a4e91ad83be51f8d596533818b246f4bee1", "UNISWAP"))
                .add(makeBoldText("BSC") + " :" + " 0x6b1C8765C7EFf0b60706b0ae489EB9bb9667465A  "
                        + addHrefAndText("https://app.apeswap.finance/swap?inputCurrency=BNB&outputCurrency=0x6b1C8765C7EFf0b60706b0ae489EB9bb9667465A", "APESWAP"))
                .toString();
    }

    private static String dexTool() {
        return "------> " + addHrefAndText("https://www.dextools.io/app/ether/pair-explorer/0x70e567076184803a43aa0ceae4e67ba31cbf89e1", "Dextools");
    }


    private static String twitter() {
        return addHrefAndText("https://twitter.com/SataToken", "Signata twitter account");
    }


    private static String latestTweets() {
        return "------> " + addHrefAndText("https://twitter.com/search?q=%24sata&f=live", "Latest Signata Tweets ! Go and interact Satard!");
    }


    private static String addHrefAndText(String link, String text) {
        return "<a href='" + link + "'>" + makeBoldText(text) + "</a>";
    }

    private static String makeBoldText(String text) {
        return "<b>" + text + "</b>";
    }

}


