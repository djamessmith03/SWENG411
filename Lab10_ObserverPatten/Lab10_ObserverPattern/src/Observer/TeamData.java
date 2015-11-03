/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Observer;

/**
 *
 * @author mst5182
 */
public class TeamData {
    public String     teamName;
    protected int     gamesPlayed;
    protected int     wins;
    protected int     losses;
    protected int     otLosses;
    protected int     goalsFor;
    protected int     goalsAgainst;
    
    TeamData(String tn,int gp, int w, int l, int otl, int gf, int ga) {
        
        teamName     = tn;
        gamesPlayed  = gp;
        wins         = w;
        losses       = l;
        otLosses     = otl; 
        goalsFor     = gf;
        goalsAgainst = ga;
        
    }
    
}
