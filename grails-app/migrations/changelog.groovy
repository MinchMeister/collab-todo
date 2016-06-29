databaseChangeLog = {

	changeSet(author: "Manifest (generated)", id: "1466619721016-1") {
		createTable(tableName: "GROUPS") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_7")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "DESCRIPTION", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Manifest (generated)", id: "1466619721016-2") {
		createTable(tableName: "TODO") {
			column(autoIncrement: "true", name: "ID", type: "BIGINT") {
				constraints(nullable: "false", primaryKey: "true", primaryKeyName: "CONSTRAINT_2")
			}

			column(name: "VERSION", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "COMPLETED_DATE", type: "TIMESTAMP")

			column(name: "DATE_CREATED", type: "TIMESTAMP") {
				constraints(nullable: "false")
			}

			column(name: "DUE_DATE", type: "TIMESTAMP")

			column(name: "GROUP_ID", type: "BIGINT") {
				constraints(nullable: "false")
			}

			column(name: "NAME", type: "VARCHAR(255)") {
				constraints(nullable: "false")
			}

			column(name: "NOTE", type: "VARCHAR(1000)")

			column(name: "PRIORITY", type: "VARCHAR(6)") {
				constraints(nullable: "false")
			}

			column(name: "STATUS", type: "VARCHAR(10)") {
				constraints(nullable: "false")
			}
		}
	}

	changeSet(author: "Manifest (generated)", id: "1466619721016-3") {
		addForeignKeyConstraint(baseColumnNames: "GROUP_ID", baseTableName: "TODO", baseTableSchemaName: "PUBLIC", constraintName: "FK_BBAT0GBC060NGT2RRR4OUQ89U", deferrable: "false", initiallyDeferred: "false", onDelete: "RESTRICT", onUpdate: "RESTRICT", referencedColumnNames: "ID", referencedTableName: "GROUPS", referencedTableSchemaName: "PUBLIC", referencesUniqueColumn: "false")
	}
}
