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
			participantes.setidMatricula(results.getString("idMatricula"));
                        participantes.setnombre(results.getString("Nombre"));
			participantes.setapellidoP(results.getString("ApellidoP"));
			participantes.setapellidoM(results.getString("ApellidoM"));
			participantes.setcorreo(results.getString("Correo"));
                        participantes.setedad(results.getString("Edad"));
                        participantes.setgenero(results.getString("Genero"));
                        participantes.settelefono(results.getString("Telefono"));
                        participantes.setnivelEstudio(results.getString("NivelEstudio"));
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
                                        statement.setString(1,participantes.getidMatricula());
					statement.setString(2,participantes.getnombre());
					statement.setString(3,participantes.getapellidoP());
					statement.setString(4,participantes.getapellidoM());
					statement.setString(5,participantes.getcorreo());
                                        statement.setString(6,participantes.getedad());
                                        statement.setString(7,participantes.getgenero());
                                        statement.setString(8,participantes.gettelefono());
                                        statement.setString(9,participantes.getnivelEstudio());
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
					statement.setString(1,update.getnombre());
					statement.setString(2,update.getapellidoP());
					statement.setString(3,update.getapellidoM());
					statement.setString(4,update.getcorreo());
                                        statement.setString(5,update.getedad());
                                        statement.setString(6,update.getgenero());
                                        statement.setString(7,update.gettelefono());
                                        statement.setString(8,update.getnivelEstudio());
                                        statement.setString(9,update.getidMatricula());
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
