class Fighter {

    boolean isVulnerable() {
        return true;
    }

    int getDamagePoints(Fighter fighter) {
        return 1;
    }
}

// TODO: define the Warrior class
class Warrior extends Fighter {

    @Override
    public String toString(){
        return "Fighter is a Warrior";
    }

    @Override
    public boolean  isVulnerable() {
        return false;
    }

    @Override
    public int getDamagePoints(Fighter figher) {
        if (figher.isVulnerable()) return 10;
        else return 6;
    }

}

// TODO: define the Wizard class
class Wizard extends Fighter {
    boolean vulnerable = true;

    @Override
    public String toString(){
        return "Fighter is a Wizard";
    }

    public void prepareSpell(){
        vulnerable = false;
    }

    @Override
    public boolean isVulnerable(){
        return vulnerable;
    }

    @Override
    public int getDamagePoints(Fighter fighter){
        if (this.isVulnerable()) return 3;
        else return 12;
    }
}