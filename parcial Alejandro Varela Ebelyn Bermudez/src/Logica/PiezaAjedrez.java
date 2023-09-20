package Logica;

public class PiezaAjedrez {
    private int x;
    private int y;
    String tipop;

    public PiezaAjedrez(int x, int y) {
        this.x = x;
        this.y = y;
    }
    public int contarMovimientosAlfil(int x, int y) {
        int movimientos = 0;
        for (int i = 1; x + i <= 8 && y + i <= 8; i++) {
            movimientos++;
        }

        for (int i = 1; x - i >= 1 && y + i <= 8; i++) {
            movimientos++;
        }

        for (int i = 1; x + i <= 8 && y - i >= 1; i++) {
            movimientos++;
        }

        for (int i = 1; x - i >= 1 && y - i >= 1; i++) {
            movimientos++;
        }

        return movimientos;
    }
    public int contarMovimientosCaballo() {
        int movimientos = 0;

        int[] dx = {-1, -2, -2, -1, 1, 2, 2, 1};
        int[] dy = {-2, -1, 1, 2, 2, 1, -1, -2};

        for (int i = 0; i < dx.length; i++) {
            int newX = x + dx[i];
            int newY = y + dy[i];

            if (newX >= 1 && newX <= 8 && newY >= 1 && newY <= 8) {
                movimientos++;
            }
        }

        return movimientos;
    }
}
}
