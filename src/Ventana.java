import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;

public class Ventana extends JFrame {
    public Ventana() {
        //Creamos la barra para poder añadir los menús después
        JMenuBar barraMenu = new JMenuBar();

        //Añadimos los menus con algun algun submenú
        JMenu menuArchivo = new JMenu("Archivo");
        JMenuItem itemNew = new JMenuItem("Nuevo");
        JMenuItem itemOpen = new JMenuItem("Abrir");
        JMenuItem itemSave = new JMenuItem("Guardar");
        //Añadimos los items al JMenu
        menuArchivo.add(itemNew);
        menuArchivo.add(itemOpen);
        menuArchivo.add(itemSave);

        JMenu menuAcciones = new JMenu("Acciones");
        JMenu menuAyuda = new JMenu("Ayuda");

        //Añadimos los JMenu a la barra
        barraMenu.add(menuArchivo);
        barraMenu.add(menuAcciones);
        barraMenu.add(menuAyuda);

        //Añadimos la barra a la ventana
        this.setJMenuBar(barraMenu);


        //Generamos todos los botones
        JButton botonNew = new JButton("Nueva Liga");
        botonNew.setBounds(50, 150, 250, 80);

        JButton botonPlay = new JButton("Jugar Liga");
        botonPlay.setBounds(50, 250, 250, 80);

        JButton botonNext = new JButton("Siguiente Jornada");
        botonNext.setEnabled(false);
        botonNext.setBounds(50, 350, 250, 80);

        JButton botonSim = new JButton("Simulación completa");
        botonSim.setEnabled(false);
        botonSim.setBounds(50, 450, 250, 80);

        JButton botonExit = new JButton("Salir");
        botonExit.setBounds(50, 700, 250, 80);

        //Añadimos los botones a la ventana
        this.add(botonNew);
        this.add(botonPlay);
        this.add(botonNext);
        this.add(botonSim);
        this.add(botonExit);

        //Creamos una info genérica para almacenar en la tabla que crearemos justo después
        Object[][] datos = {
                {"Celta", "4", "1", "3"},
                {"Sevilla FC", "4", "2", "2"},
                {"FC Barça", "3", "2", "1"},
                {"Real Madrid", "3", "2", "1"}
        };
        String[] nombresColumnas = {"Equipos", "Partidos", "Victorias", "Derrotas"};

        //Generamos la tabla
        JTable tablaInfo = new JTable(datos, nombresColumnas);
        tablaInfo.setBounds(350, 120, 1200, 700);
        tablaInfo.setFillsViewportHeight(true);
        JScrollPane scrollPane = new JScrollPane(tablaInfo);
        scrollPane.setBounds(350, 120, 1200, 700);
        this.add(scrollPane);


        setLayout(null);
        //Añadimos la tabla al JScrollPane y el JScrollPane a la ventana
        this.setSize( 1600, 900);
        this.setTitle("Probando la librería de Swing en Java");
        this.setResizable(false);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}