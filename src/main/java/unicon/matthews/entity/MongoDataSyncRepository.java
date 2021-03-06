package unicon.matthews.entity;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import unicon.matthews.entity.DataSync.DataSyncType;

@Repository
public interface MongoDataSyncRepository extends MongoRepository<DataSync, String> {
  DataSync findTopByTenantIdAndOrgIdOrderBySyncDateTimeDesc(String tenantId, String orgId);
  DataSync findTopByTenantIdAndOrgIdAndSyncTypeOrderBySyncDateTimeDesc(String tenantId, String orgId, String syncType);
}
