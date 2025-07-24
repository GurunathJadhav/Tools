output "ec2_public_ip" {
  value = module.ec2_vm.public-ip

}

output "ec2_private_ip" {
  value = module.ec2_vm.private-ip

}

output "s3_id" {
  value = module.s3_bucket.s3_bucket_id

}