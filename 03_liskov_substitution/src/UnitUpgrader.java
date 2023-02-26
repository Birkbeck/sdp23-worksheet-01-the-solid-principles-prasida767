public class UnitUpgrader {
    public void upgradeStudio(Studio studio){
        upgradeSquareFootage(studio);
    }

    public void upgradePentHouseSuite(PenthouseSuite penthouseSuite){
        upgradeSquareFootage(penthouseSuite);
        upgradeNumberOfBedroomsForPentHouse(penthouseSuite);
    }

    public void upgradeSquareFootage(Apartment apartment){
        apartment.squareFootage += 40;
    }

    public void upgradeNumberOfBedroomsForPentHouse(PenthouseSuite penthouseSuite){
        penthouseSuite.numberOfBedrooms += 1;
    }


}
