package triangulo;

import org.chocosolver.solver.Model;
import org.chocosolver.solver.Solver;
import org.chocosolver.solver.constraints.Constraint;
import org.chocosolver.solver.expression.discrete.arithmetic.ArExpression;
import org.chocosolver.solver.search.strategy.Search;
import org.chocosolver.solver.variables.IntVar;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TrianguloTest {

    @Test
    void classificaTriangulo() {
        Model model = new Model("Problema do triângulo");
        IntVar ladoA = model.intVar("ladoA", 1, 1000);
        IntVar ladoB = model.intVar("ladoB", 1, 1000);
        IntVar ladoC = model.intVar("ladoC", 1, 1000);
        ArExpression e1 = ladoB.add(ladoC);
        ladoA.lt(e1).post();
        Solver solver = model.getSolver();
        solver.solve();
        solver.printStatistics();
    }
}