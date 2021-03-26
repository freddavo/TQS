package ex1;
//Junit
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;

//Hamcrest
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

//Mockito
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
class StocksPortfolioTest {
    @Mock IStockMarket mockMarket;
    @InjectMocks StocksPortfolio portfolio;

    @BeforeEach
    void setUp() {
        portfolio.setName("Teste");
    }


    @Test
    void getTotalValueTest() {
        portfolio.addStock(new Stock("MicroSoft", 20));
        portfolio.addStock(new Stock("Apple", 40));

        Mockito.when(mockMarket.getPrice("MicroSoft")).thenReturn(10.0);
        Mockito.when(mockMarket.getPrice("Apple")).thenReturn(5.0);

        double TotalTotal = 20*10.0 + 5*40;


        assertThat(portfolio.getTotalValue(),is(TotalTotal));

        // verificar se o get foi invocado 2 vezes.

        Mockito.verify(mockMarket, Mockito.times(2)).getPrice(Mockito.anyString());

        // exemplo que vai dar erro

        //Mockito.verify(mockMarket, Mockito.times(5)).getPrice(Mockito.anyString());

    }
}