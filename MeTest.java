import static org.junit.Assert.assertEquals;
import org.junit.*;

public class MeTest {

  Me me;
  Game game;
  Game game2;
  Game game3;

  @Before
  public void before() {
    me = new Me( "Euan" );
    game = new Game( "Some Mario Shit" );
    game2 = new Game( "More Mario, God I love Mario" );
    game3 = new Game( "Stop Buying Mario, I Don't Even Own A Nintendo" );
  }

  @Test
  public void hasName() {
    assertEquals( "Euan", me.getName() );
  }

  @Test
  public void gameHasName() {
    assertEquals( "Some Mario Shit", game.getName() );
  }

  @Test
  public void startsWithNoGames() {
    assertEquals( 0, me.gameCount() );
  }

  @Test
  public void canAddAGame() {
    me.addGame( game );
    assertEquals( 1, me.gameCount() );
  }

  @Test
  public void cannotHaveMoreGamesSadFace() {
    for( int i = 0; i < 10; i++ ) {
      me.addGame( game );
    }
    assertEquals( 5, me.gameCount() );
  }

  @Test
  public void maxGamesICanHave() {
    for( int i = 0; i < 5; i++ ) {
      me.addGame( game );
    }
    assertEquals( true, me.maxGames() );
  }

  @Test  
  public void soldAllMyGames() {
    for( int i = 0; i < 5; i++ ) {
      me.addGame( game );
    }
    me.sellAllGames();
    assertEquals( 0, me.gameCount() );
  }

  @Test
  public void soldOneGame() {
    me.addGame( game );
    me.addGame( game2 );
    me.addGame( game3 );
    me.sellGame( game2 );
    // System.out.println( me.showGames() );
    assertEquals( 2, me.gameCount() );
  }
 

}














