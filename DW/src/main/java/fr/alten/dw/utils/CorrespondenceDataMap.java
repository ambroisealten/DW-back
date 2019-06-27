package fr.alten.dw.utils;

import java.util.HashMap;

public class CorrespondenceDataMap {
	private static CorrespondenceDataMap INSTANCE = null;
	
	private HashMap<String,String> correspondenceColumnTable;
	private HashMap<String,String> correspondenceToColumnTable;
	
	private HashMap<String,String> correspondenceTable;
	private HashMap<String,String> correspondenceToTable;
	
	private CorrespondenceDataMap() {
		this.correspondenceColumnTable = new HashMap<String, String>();
		this.correspondenceToColumnTable = new HashMap<String,String>();
		this.correspondenceTable = new HashMap<String,String>();
		this.correspondenceToTable = new HashMap<String,String>();
		
		fillCorrespondenceTable();
		fillCorrespondenceToTable();
		fillCorrespondenceColumnTable();
		fillCorrespondenceToColumnTable();
	}
	
	public static CorrespondenceDataMap getInstance() {
		if(CorrespondenceDataMap.INSTANCE == null) {
			CorrespondenceDataMap.INSTANCE = new CorrespondenceDataMap();
		}
		return CorrespondenceDataMap.INSTANCE;
	}
	
	private void fillCorrespondenceToTable() {
		this.correspondenceToTable.put("Entités applicatives (modalités)", "Ae");
		this.correspondenceToTable.put("Alertes déclenchées", "Alert");
		this.correspondenceToTable.put("Nombre d'études", "Count_study");
		this.correspondenceToTable.put("Lexique", "Lexicon");
		this.correspondenceToTable.put("Log entités", "Log");
		this.correspondenceToTable.put("Message des logs", "Log_message");
		this.correspondenceToTable.put("Séries", "Serie");
		this.correspondenceToTable.put("Séries (scanner)", "Serie_ct");
		this.correspondenceToTable.put("Séries (mammographie)", "Serie_mg");
		this.correspondenceToTable.put("Séries (divers)", "Serie_mr");
		this.correspondenceToTable.put("Séries (groupement)", "Serie_range");
		this.correspondenceToTable.put("Séries (radiologie)", "Serie_rf");
		this.correspondenceToTable.put("Études", "Study");
		this.correspondenceToTable.put("Alertes sur études (type)", "Ct_study_alert_protocol");
		this.correspondenceToTable.put("Études (scanner)", "Study_ct");
		this.correspondenceToTable.put("Études (mammographie)", "Study_mg");
		this.correspondenceToTable.put("Études (divers)", "Study_mr");
		this.correspondenceToTable.put("Études (groupement)", "Study_range");
		this.correspondenceToTable.put("Études (radiologie)", "Study_rf");
		
	}

	private void fillCorrespondenceTable() {
		this.correspondenceTable.put("Ae", "Entités applicatives (modalités)");
		this.correspondenceTable.put("Alert", "Alertes déclenchées");
		this.correspondenceTable.put("Count_study", "Nombre d'études");
		this.correspondenceTable.put("Lexicon", "Lexique");
		this.correspondenceTable.put("Log", "Log entités");
		this.correspondenceTable.put("Log_message", "Message des logs");
		this.correspondenceTable.put("Serie", "Séries");
		this.correspondenceTable.put("Serie_ct", "Séries (scanner)");
		this.correspondenceTable.put("Serie_mg", "Séries (mammographie)");
		this.correspondenceTable.put("Serie_mr", "Séries (divers)");
		this.correspondenceTable.put("Serie_range", "Séries (groupement)");
		this.correspondenceTable.put("Serie_rf", "Séries (radiologie)");
		this.correspondenceTable.put("Study", "Études");
		this.correspondenceTable.put("Ct_study_alert_protocol", "Alertes sur études (type)");
		this.correspondenceTable.put("Study_ct", "Études (scanner)");
		this.correspondenceTable.put("Study_mg", "Études (mammographie)");
		this.correspondenceTable.put("Study_mr", "Études (divers)");
		this.correspondenceTable.put("Study_range", "Études (groupement)");
		this.correspondenceTable.put("Study_rf", "Études (radiologie)");
	}
	
	private void fillCorrespondenceColumnTable() {
		this.correspondenceColumnTable.put("instance_key", "Numéro d'instance");
		this.correspondenceColumnTable.put("instance_name", "Nom de machine");
		this.correspondenceColumnTable.put("sdm_model", "Nom de la machine");
		this.correspondenceColumnTable.put("device_type", "Type de machine");
		
		this.correspondenceColumnTable.put("series_datetime", "Date de début série");
		this.correspondenceColumnTable.put("series_type", "Type de série");
		this.correspondenceColumnTable.put("acquisition_datetime", "Date création d'images");
		this.correspondenceColumnTable.put("target_region", "Partie du corps ciblée");
		this.correspondenceColumnTable.put("target_region_key", "Partie du corps ciblée (étude)");
		this.correspondenceColumnTable.put("exposure_time", "Temps total d'exposition");
		
		this.correspondenceColumnTable.put("alert_cause", "Cause de l'alerte");
		this.correspondenceColumnTable.put("alert_raised_date", "Date création d'alerte");
		this.correspondenceColumnTable.put("modality", "Type d'examen");
		this.correspondenceColumnTable.put("alert_raised_type", "Niveau importance d'alerte");
		
		this.correspondenceColumnTable.put("protocol", "Zone d'examen");
		this.correspondenceColumnTable.put("protocol_name", "Nom d'examen");
		
		this.correspondenceColumnTable.put("dt_last_update_dwh", "Dernière mise à jour");
		this.correspondenceColumnTable.put("dt_created", "Date de création");
		this.correspondenceColumnTable.put("dt_updated", "Mise à jour");
		
		this.correspondenceColumnTable.put("id", "ID");
		this.correspondenceColumnTable.put("facility_key", "Numéro d'hôpital");
		this.correspondenceColumnTable.put("patient_key", "Numéro du patient");
		
		this.correspondenceColumnTable.put("study_key", "Numéro d'étude");
		this.correspondenceColumnTable.put("count_study", "Nombre d'études");
		this.correspondenceColumnTable.put("study_date", "Date début étude");
		this.correspondenceColumnTable.put("study_end_date", "Date fin étude");
		this.correspondenceColumnTable.put("study_datetime", "Date début étude");
		this.correspondenceColumnTable.put("study_description", "Description d'étude");
		this.correspondenceColumnTable.put("study_description_name", "Description d'étude");
		
		this.correspondenceColumnTable.put("patient_sex", "Sexe du patient");
		this.correspondenceColumnTable.put("patient_weight", "Poids du patient");
		this.correspondenceColumnTable.put("patient_size", "Taille du patient");
		this.correspondenceColumnTable.put("patient_age_range", "Tranche d'âge du patient");
		this.correspondenceColumnTable.put("patient_bmi", "IMC du patient");
	}
	
	private void fillCorrespondenceToColumnTable() {
		this.correspondenceToColumnTable.put("Numéro d'instance", "instance_key");
		this.correspondenceToColumnTable.put("Nom de machine", "instance_name");
		this.correspondenceToColumnTable.put("Nom de la machine", "sdm_model");
		this.correspondenceToColumnTable.put("Type de machine", "device_type");
		
		this.correspondenceToColumnTable.put("Date de début série", "series_datetime");
		this.correspondenceToColumnTable.put("Type de série", "series_type");
		this.correspondenceToColumnTable.put("Date création d'images", "acquisition_datetime");
		this.correspondenceToColumnTable.put("Partie du corps ciblée", "target_region");
		this.correspondenceToColumnTable.put("Partie du corps ciblée (étude)", "target_region_key");
		this.correspondenceToColumnTable.put("Temps total d'exposition","exposure_time");
		
		this.correspondenceToColumnTable.put("Cause de l'alerte","alert_cause");
		this.correspondenceToColumnTable.put("Date création d'alerte","alert_raised_date");
		this.correspondenceToColumnTable.put("Type d'examen","modality");
		this.correspondenceToColumnTable.put("Niveau importance d'alerte","alert_raised_type");
		
		this.correspondenceToColumnTable.put("Zone d'examen","protocol");
		this.correspondenceToColumnTable.put("Nom d'examen","protocol_name");
		
		this.correspondenceToColumnTable.put("Dernière mise à jour","dt_last_update_dwh");
		this.correspondenceToColumnTable.put("Date de création", "dt_created");
		this.correspondenceToColumnTable.put("Mise à jour","dt_updated");
		
		this.correspondenceToColumnTable.put("ID","id");
		this.correspondenceToColumnTable.put("Numéro d'hôpital","facility_key");
		this.correspondenceToColumnTable.put("Numéro du patient","patient_key");
		
		this.correspondenceToColumnTable.put("Numéro d'étude", "study_key");
		this.correspondenceToColumnTable.put("Nombre d'études", "count_study");
		this.correspondenceToColumnTable.put("Date début étude", "study_date");
		this.correspondenceToColumnTable.put("Date fin étude", "study_end_date");
		this.correspondenceToColumnTable.put("Date début étude", "study_datetime");
		this.correspondenceToColumnTable.put("Description d'étude", "study_description");
		this.correspondenceToColumnTable.put("Description d'étude", "study_description_name");
		
		this.correspondenceToColumnTable.put("Sexe du patient","patient_sex");
		this.correspondenceToColumnTable.put("Poids du patient","patient_weight");
		this.correspondenceToColumnTable.put("Taille du patient","patient_size");
		this.correspondenceToColumnTable.put("Tranche d'âge du patient","patient_age_range");
		this.correspondenceToColumnTable.put("IMC du patient","patient_bmi");
	}
	
	public String getColumnWithName(String columnName) {
		String translated = this.correspondenceToColumnTable.get(columnName);
		if(translated != null) {
			return translated;
		}
		else {
			return columnName;
		}
	}
	
	public String getColumnName(String column) {
		String translated = this.correspondenceColumnTable.get(column);
		if(translated != null) {
			return translated;
		}
		else {
			return column;
		}
	}

	public String getTableWithName(String tableName) {
		String translated = this.correspondenceToTable.get(tableName);
		if(translated != null) {
			return translated;
		}
		else {
			return tableName;
		}
	}
	
	public String getTableName(String table) {
		String translated = this.correspondenceTable.get(table);
		if(translated != null) {
			return translated;
		}
		else {
			return table;
		}
	}
	
}
