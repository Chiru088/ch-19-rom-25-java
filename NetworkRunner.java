class NetworkRunner {
    public static void main(String[] args) {
        Network ref1 = new Network();
        ref1.provider = "Jio";
        ref1.type = "4G";
        ref1.speedMbps = 50.0;
        ref1.coveragePercentage = 95;
        ref1.is5GSupported = true;

        System.out.println("Provider: " + ref1.provider);
        System.out.println("Type: " + ref1.type);
        System.out.println("Speed: " + ref1.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref1.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref1.is5GSupported);
        System.out.println();

        Network ref2 = new Network();
        ref2.provider = "Airtel";
        ref2.type = "5G";
        ref2.speedMbps = 120.0;
        ref2.coveragePercentage = 90;
        ref2.is5GSupported = true;

        System.out.println("Provider: " + ref2.provider);
        System.out.println("Type: " + ref2.type);
        System.out.println("Speed: " + ref2.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref2.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref2.is5GSupported);
        System.out.println();

        Network ref3 = new Network();
        ref3.provider = "Vi";
        ref3.type = "3G";
        ref3.speedMbps = 15.0;
        ref3.coveragePercentage = 85;
        ref3.is5GSupported = false;

        System.out.println("Provider: " + ref3.provider);
        System.out.println("Type: " + ref3.type);
        System.out.println("Speed: " + ref3.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref3.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref3.is5GSupported);
        System.out.println();

        Network ref4 = new Network();
        ref4.provider = "BSNL";
        ref4.type = "2G";
        ref4.speedMbps = 5.0;
        ref4.coveragePercentage = 70;
        ref4.is5GSupported = false;

        System.out.println("Provider: " + ref4.provider);
        System.out.println("Type: " + ref4.type);
        System.out.println("Speed: " + ref4.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref4.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref4.is5GSupported);
        System.out.println();

        Network ref5 = new Network();
        ref5.provider = "Tata Docomo";
        ref5.type = "3G";
        ref5.speedMbps = 12.5;
        ref5.coveragePercentage = 60;
        ref5.is5GSupported = false;

        System.out.println("Provider: " + ref5.provider);
        System.out.println("Type: " + ref5.type);
        System.out.println("Speed: " + ref5.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref5.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref5.is5GSupported);
        System.out.println();

        Network ref6 = new Network();
        ref6.provider = "Reliance";
        ref6.type = "4G";
        ref6.speedMbps = 40.0;
        ref6.coveragePercentage = 88;
        ref6.is5GSupported = true;

        System.out.println("Provider: " + ref6.provider);
        System.out.println("Type: " + ref6.type);
        System.out.println("Speed: " + ref6.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref6.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref6.is5GSupported);
        System.out.println();

        Network ref7 = new Network();
        ref7.provider = "MTNL";
        ref7.type = "3G";
        ref7.speedMbps = 10.0;
        ref7.coveragePercentage = 50;
        ref7.is5GSupported = false;

        System.out.println("Provider: " + ref7.provider);
        System.out.println("Type: " + ref7.type);
        System.out.println("Speed: " + ref7.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref7.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref7.is5GSupported);
        System.out.println();

        Network ref8 = new Network();
        ref8.provider = "Vodafone";
        ref8.type = "4G";
        ref8.speedMbps = 45.0;
        ref8.coveragePercentage = 82;
        ref8.is5GSupported = false;

        System.out.println("Provider: " + ref8.provider);
        System.out.println("Type: " + ref8.type);
        System.out.println("Speed: " + ref8.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref8.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref8.is5GSupported);
        System.out.println();

        Network ref9 = new Network();
        ref9.provider = "Idea";
        ref9.type = "3G";
        ref9.speedMbps = 18.0;
        ref9.coveragePercentage = 75;
        ref9.is5GSupported = false;

        System.out.println("Provider: " + ref9.provider);
        System.out.println("Type: " + ref9.type);
        System.out.println("Speed: " + ref9.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref9.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref9.is5GSupported);
        System.out.println();

        Network ref10 = new Network();
        ref10.provider = "T-Mobile";
        ref10.type = "5G";
        ref10.speedMbps = 150.0;
        ref10.coveragePercentage = 98;
        ref10.is5GSupported = true;

        System.out.println("Provider: " + ref10.provider);
        System.out.println("Type: " + ref10.type);
        System.out.println("Speed: " + ref10.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref10.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref10.is5GSupported);
        System.out.println();

        // Objects 11 to 20 follow the same pattern
        Network ref11 = new Network();
        ref11.provider = "Sprint";
        ref11.type = "4G";
        ref11.speedMbps = 35.0;
        ref11.coveragePercentage = 76;
        ref11.is5GSupported = false;

        System.out.println("Provider: " + ref11.provider);
        System.out.println("Type: " + ref11.type);
        System.out.println("Speed: " + ref11.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref11.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref11.is5GSupported);
        System.out.println();

        Network ref12 = new Network();
        ref12.provider = "AT&T";
        ref12.type = "5G";
        ref12.speedMbps = 160.0;
        ref12.coveragePercentage = 96;
        ref12.is5GSupported = true;

        System.out.println("Provider: " + ref12.provider);
        System.out.println("Type: " + ref12.type);
        System.out.println("Speed: " + ref12.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref12.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref12.is5GSupported);
        System.out.println();

        Network ref13 = new Network();
        ref13.provider = "Orange";
        ref13.type = "4G";
        ref13.speedMbps = 42.0;
        ref13.coveragePercentage = 85;
        ref13.is5GSupported = true;

        System.out.println("Provider: " + ref13.provider);
        System.out.println("Type: " + ref13.type);
        System.out.println("Speed: " + ref13.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref13.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref13.is5GSupported);
        System.out.println();

        Network ref14 = new Network();
        ref14.provider = "O2";
        ref14.type = "3G";
        ref14.speedMbps = 20.0;
        ref14.coveragePercentage = 77;
        ref14.is5GSupported = false;

        System.out.println("Provider: " + ref14.provider);
        System.out.println("Type: " + ref14.type);
        System.out.println("Speed: " + ref14.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref14.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref14.is5GSupported);
        System.out.println();

        Network ref15 = new Network();
        ref15.provider = "Verizon";
        ref15.type = "5G";
        ref15.speedMbps = 170.0;
        ref15.coveragePercentage = 99;
        ref15.is5GSupported = true;

        System.out.println("Provider: " + ref15.provider);
        System.out.println("Type: " + ref15.type);
        System.out.println("Speed: " + ref15.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref15.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref15.is5GSupported);
        System.out.println();

        Network ref16 = new Network();
        ref16.provider = "Boost";
        ref16.type = "4G";
        ref16.speedMbps = 37.0;
        ref16.coveragePercentage = 70;
        ref16.is5GSupported = false;

        System.out.println("Provider: " + ref16.provider);
        System.out.println("Type: " + ref16.type);
        System.out.println("Speed: " + ref16.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref16.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref16.is5GSupported);
        System.out.println();

        Network ref17 = new Network();
        ref17.provider = "Spectrum";
        ref17.type = "3G";
        ref17.speedMbps = 22.0;
        ref17.coveragePercentage = 60;
        ref17.is5GSupported = false;

        System.out.println("Provider: " + ref17.provider);
        System.out.println("Type: " + ref17.type);
        System.out.println("Speed: " + ref17.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref17.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref17.is5GSupported);
        System.out.println();

        Network ref18 = new Network();
        ref18.provider = "U Mobile";
        ref18.type = "4G";
        ref18.speedMbps = 38.5;
        ref18.coveragePercentage = 79;
        ref18.is5GSupported = true;

        System.out.println("Provider: " + ref18.provider);
        System.out.println("Type: " + ref18.type);
        System.out.println("Speed: " + ref18.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref18.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref18.is5GSupported);
        System.out.println();

        Network ref19 = new Network();
        ref19.provider = "Maxis";
        ref19.type = "5G";
        ref19.speedMbps = 140.0;
        ref19.coveragePercentage = 91;
        ref19.is5GSupported = true;

        System.out.println("Provider: " + ref19.provider);
        System.out.println("Type: " + ref19.type);
        System.out.println("Speed: " + ref19.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref19.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref19.is5GSupported);
        System.out.println();

        Network ref20 = new Network();
        ref20.provider = "Celcom";
        ref20.type = "4G";
        ref20.speedMbps = 48.0;
        ref20.coveragePercentage = 84;
        ref20.is5GSupported = true;

        System.out.println("Provider: " + ref20.provider);
        System.out.println("Type: " + ref20.type);
        System.out.println("Speed: " + ref20.speedMbps + " Mbps");
        System.out.println("Coverage: " + ref20.coveragePercentage + "%");
        System.out.println("5G Supported: " + ref20.is5GSupported);
        System.out.println();
    }
}
