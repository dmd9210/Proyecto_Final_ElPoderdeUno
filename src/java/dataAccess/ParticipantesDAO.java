/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dataAccess;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import model.Participante;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ParticipantesDAO{

private PreparedStatement statement;
	private Connection connection;
		private static final Logger logger =
		Logger.getLogger(ParticipantesDAO.class.getName());

	public ParticipantesDAO(){

	}

	public ParticipantesDAO(Connection connection){
		this.connection = connection;
	}

   

	public Connection getConnection() {
		return connection;
	}

	public void setConnection(Connection connection){
		this.connection = connection;
	}

	public ArrayList<Participante> getparticipantesList() {
		ArrayList<Participante> participantesList = new ArrayList<Participante>();
		try {
			statement = connection.prepareStatement(" SELECT * FROM participante");
				//obtain list of guard 
			synchronized (statement) {
				ResultSet results = statement.executeQuery();
					//get rows data
					while (results.next()) {
                        //aqui se agregan los atributos de la base de datos
                        Participante  participantes = new Participante();
			participantes.setIdMatricula(results.getString("idMatricula"));
                        participantes.setNombre(results.getString("Nombre"));
			participantes.setApellidoP(results.getString("ApellidoP"));
			participantes.setApellidoM(results.getString("ApellidoM"));
			participantes.setCorreo(results.getString("Correo"));
                        participantes.setEdad(results.getString("Edad"));
                        participantes.setGenero(results.getString("Genero"));
                        participantes.setTelefono(results.getString("Telefono"));
                        participantes.setNivelEstudio(results.getString("NivelEstudio"));
                        participantesList.add(participantes);
			}

			}
			statement.close();

		} catch (SQLException sqle){
			logger.log(Level.SEVERE, sqle.toString(),
				sqle);
			throw new
			RuntimeException(sqle);
			}
			return participantesList;
	}
        
	public void addParticipantes (Participante participantes){
		try{
			statement = 
			connection.prepareStatement("INSERT INTO participante VALUES(?,?,?,?,?,?,?,?,?)"); 
				synchronized(statement){
                                        statement.setString(1,participantes.getIdMatricula());
					statement.setString(2,participantes.getNombre());
					statement.setString(3,participantes.getApellidoP());
					statement.setString(4,participantes.getApellidoM());
					statement.setString(5,participantes.getCorreo());
                                        statement.setString(6,participantes.getEdad());
                                        statement.setString(7,participantes.getGenero());
                                        statement.setString(8,participantes.getTelefono());
                                        statement.setString(9,participantes.getNivelEstudio());
					statement.executeUpdate();
					}
					statement.close();
					} catch(SQLException sqle){
						logger.log( Level.SEVERE, 
							sqle.toString(),sqle);
						throw new
						RuntimeException(sqle);
						}
	}
        
        public void updateParticipantes (Participante update){
		try{
			statement = 
			connection.prepareStatement("UPDATE elpoderdeuno.participante SET Nombre=?,ApellidoP=?,"
                                + "ApellidoM=?,Correo=?,Edad=?,Genero=?,"
                                + "Telefono=?,NivelEstudio=? WHERE IdMatricula=?"); 
				synchronized(statement){
					statement.setString(1,update.getNombre());
					statement.setString(2,update.getApellidoP());
					statement.setString(3,update.getApellidoM());
					statement.setString(4,update.getCorreo());
                                        statement.setString(5,update.getEdad());
                                        statement.setString(6,update.getGenero());
                                        statement.setString(7,update.getTelefono());
                                        statement.setString(9,update.getNivelEstudio());
                                        statement.setString(10,update.getIdMatricula());
					statement.executeUpdate();
					}
					statement.close();
					} catch(SQLException sqle){
						logger.log( Level.SEVERE, 
							sqle.toString(),sqle);
						throw new
						RuntimeException(sqle);
						}
	}


}
