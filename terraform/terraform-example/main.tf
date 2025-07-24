module "ec2_vm" {
  source = "./modules/ec2"

}

module "s3_bucket" {
  source = "./modules/s3"

}